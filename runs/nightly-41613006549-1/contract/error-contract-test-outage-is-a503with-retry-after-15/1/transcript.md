# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-f48e704e-8bb2-47b0-a4e0-111b2fcc9891` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-f04fb32d-c713-4be8-912d-013745e2f967` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-f3f47bc1-5cd5-4ee2-948f-91d1320de061` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-2b321e21-bdd2-4fb6-8428-24ad01b11eb7` |
| 5 | `POST /v1/credits/purchases` | 503 | 4 | `qa-75f89e03-8afa-4cc2-b506-2741c2fd0c67` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-dfef73d0-f8ad-48e1-b274-06e890c9c2e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-85b0df59-2dd0-4f43-ab6c-22bb875b48b2` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-8bbb43b9-eb56-41ea-a181-6a19a93a4277` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-3b74df95-933b-4d1d-8d2f-133545006edd` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-9bd0964c-42dd-4674-a1df-df2107f6709c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f48e704e-8bb2-47b0-a4e0-111b2fcc9891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f48e704e-8bb2-47b0-a4e0-111b2fcc9891
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b9ff3c3300","displayName":"QA a8b9ff3c3300","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f48e704e-8bb2-47b0-a4e0-111b2fcc9891
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Location: /v1/accounts/qa-a8b9ff3c3300
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb018a26-d38b-45cb-92e5-80b1ea181b88","handle":"qa-a8b9ff3c3300","displayName":"QA a8b9ff3c3300","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.169450731Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f04fb32d-c713-4be8-912d-013745e2f967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f04fb32d-c713-4be8-912d-013745e2f967
Content-Type: application/json

--- request body ---
{"handle":"qa-caf10562e45f","displayName":"QA caf10562e45f","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f04fb32d-c713-4be8-912d-013745e2f967
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Location: /v1/accounts/qa-caf10562e45f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8334eeda-b694-48af-9fdc-6bde781e6845","handle":"qa-caf10562e45f","displayName":"QA caf10562e45f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.204515024Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f3f47bc1-5cd5-4ee2-948f-91d1320de061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f47bc1-5cd5-4ee2-948f-91d1320de061
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b9ff3c3300","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3f47bc1-5cd5-4ee2-948f-91d1320de061
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb018a26-d38b-45cb-92e5-80b1ea181b88"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2b321e21-bdd2-4fb6-8428-24ad01b11eb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b321e21-bdd2-4fb6-8428-24ad01b11eb7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-caf10562e45f","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b321e21-bdd2-4fb6-8428-24ad01b11eb7
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
Location: /v1/conversations/cnv_228657e9-1623-470c-a12c-dfc51f951397
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_228657e9-1623-470c-a12c-dfc51f951397","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8b9ff3c3300","qa-caf10562e45f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.277958997Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-75f89e03-8afa-4cc2-b506-2741c2fd0c67

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4485b2efffe94290a8d830d31e03f889
X-Fault-Key: 7300168a-ef3e-493b-a85e-2d425a5c452f
X-Fault: unavailable-once
X-Correlation-Id: qa-75f89e03-8afa-4cc2-b506-2741c2fd0c67
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75f89e03-8afa-4cc2-b506-2741c2fd0c67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-75f89e03-8afa-4cc2-b506-2741c2fd0c67"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dfef73d0-f8ad-48e1-b274-06e890c9c2e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfef73d0-f8ad-48e1-b274-06e890c9c2e3
Content-Type: application/json

--- request body ---
{"handle":"qa-caf10562e45f","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfef73d0-f8ad-48e1-b274-06e890c9c2e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8334eeda-b694-48af-9fdc-6bde781e6845"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85b0df59-2dd0-4f43-ab6c-22bb875b48b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b0df59-2dd0-4f43-ab6c-22bb875b48b2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85b0df59-2dd0-4f43-ab6c-22bb875b48b2
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
correlation: qa-8bbb43b9-eb56-41ea-a181-6a19a93a4277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bbb43b9-eb56-41ea-a181-6a19a93a4277
Content-Type: application/json

--- request body ---
{"handle":"qa-caf10562e45f","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bbb43b9-eb56-41ea-a181-6a19a93a4277
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bbb43b9-eb56-41ea-a181-6a19a93a4277"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b74df95-933b-4d1d-8d2f-133545006edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b74df95-933b-4d1d-8d2f-133545006edd
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b74df95-933b-4d1d-8d2f-133545006edd
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
correlation: qa-9bd0964c-42dd-4674-a1df-df2107f6709c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bd0964c-42dd-4674-a1df-df2107f6709c
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b9ff3c3300","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bd0964c-42dd-4674-a1df-df2107f6709c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9bd0964c-42dd-4674-a1df-df2107f6709c"}
```
