# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-a6f9acbf-eec4-48a1-a94b-45e020489df7` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-fb6baf8d-911e-4008-817f-ac84bae9b5c4` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-865b6f52-6cad-4806-bd2f-5a348d1d64a2` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-6377cef4-ad60-44ad-8f78-ff96c0d5eba3` |
| 5 | `GET /v1/credits/balance` | 503 | 18 | `qa-51a5df59-0cd7-49a5-af1c-04d7025496cc` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-c9daa581-4de3-4551-8cc2-8bdfab06d9ed` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-810488a3-ba07-4ee7-b043-820a9a713e97` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-18b3f47b-980a-47c4-963f-269b370bb8c1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-42a1af0d-051c-4f4f-90c5-8fc1874b1fb0` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-519ca3d5-8a5e-4a9c-b807-62f45bfbb7be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a6f9acbf-eec4-48a1-a94b-45e020489df7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f9acbf-eec4-48a1-a94b-45e020489df7
Content-Type: application/json

--- request body ---
{"handle":"qa-491e9832e325","displayName":"QA 491e9832e325","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6f9acbf-eec4-48a1-a94b-45e020489df7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Location: /v1/accounts/qa-491e9832e325
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3568b60d-7716-42b5-abb9-ff4d9ec18d2e","handle":"qa-491e9832e325","displayName":"QA 491e9832e325","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.332996745Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fb6baf8d-911e-4008-817f-ac84bae9b5c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb6baf8d-911e-4008-817f-ac84bae9b5c4
Content-Type: application/json

--- request body ---
{"handle":"qa-f2559478c7e8","displayName":"QA f2559478c7e8","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb6baf8d-911e-4008-817f-ac84bae9b5c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Location: /v1/accounts/qa-f2559478c7e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34bea6d7-3f6e-42f8-94c4-369fe790447d","handle":"qa-f2559478c7e8","displayName":"QA f2559478c7e8","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.414112659Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-865b6f52-6cad-4806-bd2f-5a348d1d64a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-865b6f52-6cad-4806-bd2f-5a348d1d64a2
Content-Type: application/json

--- request body ---
{"handle":"qa-491e9832e325","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-865b6f52-6cad-4806-bd2f-5a348d1d64a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3568b60d-7716-42b5-abb9-ff4d9ec18d2e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6377cef4-ad60-44ad-8f78-ff96c0d5eba3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6377cef4-ad60-44ad-8f78-ff96c0d5eba3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f2559478c7e8","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6377cef4-ad60-44ad-8f78-ff96c0d5eba3
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
Location: /v1/conversations/cnv_53057f72-7fcc-4df8-9aeb-72ae9c322b5b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53057f72-7fcc-4df8-9aeb-72ae9c322b5b","subject":"Error contract","status":"open","region":"eu","participants":["qa-491e9832e325","qa-f2559478c7e8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.483552626Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-51a5df59-0cd7-49a5-af1c-04d7025496cc

--- request headers ---
Accept: application/json
X-Fault-Key: e2a31e8b-5e53-415d-81ac-0f5d36a636a3
X-Fault: unavailable-once
X-Correlation-Id: qa-51a5df59-0cd7-49a5-af1c-04d7025496cc
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51a5df59-0cd7-49a5-af1c-04d7025496cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-51a5df59-0cd7-49a5-af1c-04d7025496cc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c9daa581-4de3-4551-8cc2-8bdfab06d9ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9daa581-4de3-4551-8cc2-8bdfab06d9ed
Content-Type: application/json

--- request body ---
{"handle":"qa-f2559478c7e8","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9daa581-4de3-4551-8cc2-8bdfab06d9ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34bea6d7-3f6e-42f8-94c4-369fe790447d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-810488a3-ba07-4ee7-b043-820a9a713e97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810488a3-ba07-4ee7-b043-820a9a713e97
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-810488a3-ba07-4ee7-b043-820a9a713e97
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
correlation: qa-18b3f47b-980a-47c4-963f-269b370bb8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b3f47b-980a-47c4-963f-269b370bb8c1
Content-Type: application/json

--- request body ---
{"handle":"qa-f2559478c7e8","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18b3f47b-980a-47c4-963f-269b370bb8c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18b3f47b-980a-47c4-963f-269b370bb8c1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42a1af0d-051c-4f4f-90c5-8fc1874b1fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42a1af0d-051c-4f4f-90c5-8fc1874b1fb0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42a1af0d-051c-4f4f-90c5-8fc1874b1fb0
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
correlation: qa-519ca3d5-8a5e-4a9c-b807-62f45bfbb7be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-519ca3d5-8a5e-4a9c-b807-62f45bfbb7be
Content-Type: application/json

--- request body ---
{"handle":"qa-491e9832e325","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-519ca3d5-8a5e-4a9c-b807-62f45bfbb7be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-519ca3d5-8a5e-4a9c-b807-62f45bfbb7be"}
```
