# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-3539c269-f067-405c-a7e3-6d844935d877` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-6382687e-5579-4c8e-8e8a-e28f05dfb9f3` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-ba6b2d01-082b-4db9-83bc-1cc911657ffe` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-aceb8a86-9e4e-4b5b-ad41-a757a4756465` |
| 5 | `POST /v1/credits/purchases` | 415 | 13 | `qa-52bef74b-2a27-4658-85bb-7d70cc17abc8` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-1f346606-e20a-4ecd-9d1b-7541f2457e29` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2f9f0ff6-592e-4ba6-9e47-86333f0e4469` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-18a5bc1d-1d2f-4ac1-9b35-af31d6f0629e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3d31e2fd-1c97-46f2-ae97-6ee502f79028` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-3655c63b-63a0-40f1-93a6-d6e79797a208` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3539c269-f067-405c-a7e3-6d844935d877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3539c269-f067-405c-a7e3-6d844935d877
Content-Type: application/json

--- request body ---
{"handle":"qa-2f34942ed108","displayName":"QA 2f34942ed108","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3539c269-f067-405c-a7e3-6d844935d877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f34942ed108
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c98410c3-e78e-490c-b7d5-6b1884cf8d6e","handle":"qa-2f34942ed108","displayName":"QA 2f34942ed108","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.349521274Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6382687e-5579-4c8e-8e8a-e28f05dfb9f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6382687e-5579-4c8e-8e8a-e28f05dfb9f3
Content-Type: application/json

--- request body ---
{"handle":"qa-c89c56180079","displayName":"QA c89c56180079","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6382687e-5579-4c8e-8e8a-e28f05dfb9f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Location: /v1/accounts/qa-c89c56180079
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d67009aa-865a-48fa-a71f-72e38b195941","handle":"qa-c89c56180079","displayName":"QA c89c56180079","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.373805411Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba6b2d01-082b-4db9-83bc-1cc911657ffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba6b2d01-082b-4db9-83bc-1cc911657ffe
Content-Type: application/json

--- request body ---
{"handle":"qa-2f34942ed108","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba6b2d01-082b-4db9-83bc-1cc911657ffe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c98410c3-e78e-490c-b7d5-6b1884cf8d6e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aceb8a86-9e4e-4b5b-ad41-a757a4756465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aceb8a86-9e4e-4b5b-ad41-a757a4756465
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c89c56180079","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-aceb8a86-9e4e-4b5b-ad41-a757a4756465
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
Location: /v1/conversations/cnv_d23818ff-b740-443b-83fd-9ada3b49171f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d23818ff-b740-443b-83fd-9ada3b49171f","subject":"Error contract","status":"open","region":"eu","participants":["qa-2f34942ed108","qa-c89c56180079"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.428437463Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-52bef74b-2a27-4658-85bb-7d70cc17abc8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-01680bcbbcca45e7b4946f58b995563a
X-Correlation-Id: qa-52bef74b-2a27-4658-85bb-7d70cc17abc8
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52bef74b-2a27-4658-85bb-7d70cc17abc8
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-52bef74b-2a27-4658-85bb-7d70cc17abc8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1f346606-e20a-4ecd-9d1b-7541f2457e29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f346606-e20a-4ecd-9d1b-7541f2457e29
Content-Type: application/json

--- request body ---
{"handle":"qa-c89c56180079","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f346606-e20a-4ecd-9d1b-7541f2457e29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d67009aa-865a-48fa-a71f-72e38b195941"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f9f0ff6-592e-4ba6-9e47-86333f0e4469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f9f0ff6-592e-4ba6-9e47-86333f0e4469
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f9f0ff6-592e-4ba6-9e47-86333f0e4469
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-18a5bc1d-1d2f-4ac1-9b35-af31d6f0629e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a5bc1d-1d2f-4ac1-9b35-af31d6f0629e
Content-Type: application/json

--- request body ---
{"handle":"qa-c89c56180079","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18a5bc1d-1d2f-4ac1-9b35-af31d6f0629e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18a5bc1d-1d2f-4ac1-9b35-af31d6f0629e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d31e2fd-1c97-46f2-ae97-6ee502f79028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d31e2fd-1c97-46f2-ae97-6ee502f79028
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d31e2fd-1c97-46f2-ae97-6ee502f79028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3655c63b-63a0-40f1-93a6-d6e79797a208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3655c63b-63a0-40f1-93a6-d6e79797a208
Content-Type: application/json

--- request body ---
{"handle":"qa-2f34942ed108","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3655c63b-63a0-40f1-93a6-d6e79797a208
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3655c63b-63a0-40f1-93a6-d6e79797a208"}
```
