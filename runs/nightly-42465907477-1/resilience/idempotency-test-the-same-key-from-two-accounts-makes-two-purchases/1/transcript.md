# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-53592c9a-56f5-49cc-be47-bd35f8983315` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-8d5315cd-8053-445d-9275-1575dedbf95a` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-92339a29-5adf-4e96-b9f6-6fd84abaf457` |
| 4 | `POST /v1/credits/purchases` | 201 | 81 | `qa-41ac4b0c-4236-49ba-835c-9f360536adad` |
| 5 | `POST /v1/auth/token` | 200 | 12 | `qa-e53eb265-f0fc-4a98-963b-a1110c075479` |
| 6 | `POST /v1/credits/purchases` | 201 | 7 | `qa-fdecc732-e95a-4725-8f40-150cfaa1c740` |
| 7 | `DELETE /v1/accounts/me` | 204 | 60 | `qa-2f87d087-2dde-462e-9e59-0e7d7f3e0aee` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-97c1e4ee-b2df-4b7d-b9f7-ffdc9c5c5434` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ce3c3f74-a817-4703-ad53-0b7784d7bb71` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-3e302fce-56e5-4f33-bacd-8a172f854662` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53592c9a-56f5-49cc-be47-bd35f8983315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53592c9a-56f5-49cc-be47-bd35f8983315
Content-Type: application/json

--- request body ---
{"handle":"qa-ac966527ef2b","displayName":"QA ac966527ef2b","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-53592c9a-56f5-49cc-be47-bd35f8983315
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-ac966527ef2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_707322d2-99e4-420b-b8a1-078d96f4c371","handle":"qa-ac966527ef2b","displayName":"QA ac966527ef2b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:11.444948684Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8d5315cd-8053-445d-9275-1575dedbf95a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d5315cd-8053-445d-9275-1575dedbf95a
Content-Type: application/json

--- request body ---
{"handle":"qa-aa85dd79507f","displayName":"QA aa85dd79507f","password":"****","region":"us"}

--- response: 201 in 51 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d5315cd-8053-445d-9275-1575dedbf95a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-aa85dd79507f
X-Served-Region: us
Content-Length: 181

{"id":"acc_be45dbf3-0f42-4362-b42b-24d17a9e2df2","handle":"qa-aa85dd79507f","displayName":"QA aa85dd79507f","region":"us","role":"user","createdAt":"2026-11-08T09:09:11.955742278Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-92339a29-5adf-4e96-b9f6-6fd84abaf457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92339a29-5adf-4e96-b9f6-6fd84abaf457
Content-Type: application/json

--- request body ---
{"handle":"qa-ac966527ef2b","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-92339a29-5adf-4e96-b9f6-6fd84abaf457
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_707322d2-99e4-420b-b8a1-078d96f4c371"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-41ac4b0c-4236-49ba-835c-9f360536adad

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d3563b083011495d8b574a810d1cfecc
X-Correlation-Id: qa-41ac4b0c-4236-49ba-835c-9f360536adad
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 81 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-41ac4b0c-4236-49ba-835c-9f360536adad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_597af168-3fd7-472a-a78c-783d0e0c51d8
Content-Length: 144

{"id":"pur_597af168-3fd7-472a-a78c-783d0e0c51d8","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.162569729Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e53eb265-f0fc-4a98-963b-a1110c075479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e53eb265-f0fc-4a98-963b-a1110c075479
Content-Type: application/json

--- request body ---
{"handle":"qa-aa85dd79507f","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e53eb265-f0fc-4a98-963b-a1110c075479
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be45dbf3-0f42-4362-b42b-24d17a9e2df2"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fdecc732-e95a-4725-8f40-150cfaa1c740

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d3563b083011495d8b574a810d1cfecc
X-Correlation-Id: qa-fdecc732-e95a-4725-8f40-150cfaa1c740
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdecc732-e95a-4725-8f40-150cfaa1c740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_54182a4e-a7c7-4845-a02f-64db6c95eca2
Content-Length: 144

{"id":"pur_54182a4e-a7c7-4845-a02f-64db6c95eca2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.264145676Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f87d087-2dde-462e-9e59-0e7d7f3e0aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f87d087-2dde-462e-9e59-0e7d7f3e0aee
Content-Type: application/json

--- response: 204 in 60 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f87d087-2dde-462e-9e59-0e7d7f3e0aee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-97c1e4ee-b2df-4b7d-b9f7-ffdc9c5c5434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97c1e4ee-b2df-4b7d-b9f7-ffdc9c5c5434
Content-Type: application/json

--- request body ---
{"handle":"qa-aa85dd79507f","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97c1e4ee-b2df-4b7d-b9f7-ffdc9c5c5434
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97c1e4ee-b2df-4b7d-b9f7-ffdc9c5c5434"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce3c3f74-a817-4703-ad53-0b7784d7bb71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce3c3f74-a817-4703-ad53-0b7784d7bb71
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce3c3f74-a817-4703-ad53-0b7784d7bb71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3e302fce-56e5-4f33-bacd-8a172f854662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e302fce-56e5-4f33-bacd-8a172f854662
Content-Type: application/json

--- request body ---
{"handle":"qa-ac966527ef2b","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e302fce-56e5-4f33-bacd-8a172f854662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e302fce-56e5-4f33-bacd-8a172f854662"}
```
