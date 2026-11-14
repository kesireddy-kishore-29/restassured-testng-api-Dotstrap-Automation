# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-e5a68030-d5ea-442a-bece-ec16f32c22b8` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-c88d86ce-e8eb-4e38-ab4c-63d778c6806b` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-196a834c-91ba-4d6d-ab37-ba82ce4e4ba4` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-de575adf-b60b-4a2e-84ee-91f27640b251` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 21 | `qa-44a8012a-4b0d-4751-be51-0f24ab420322` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-a63e2486-b69a-40e2-a500-67264508a899` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-7935dd16-ac69-4210-b1fd-ec703706613d` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-3d30a6bf-34a9-4698-9938-18bc07619660` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7045618b-a755-44b4-83a1-2cb6a09b23f8` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-2d4188f1-8ddf-4a51-93be-74c1f1daa5d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5a68030-d5ea-442a-bece-ec16f32c22b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a68030-d5ea-442a-bece-ec16f32c22b8
Content-Type: application/json

--- request body ---
{"handle":"qa-2b5acd920454","displayName":"QA 2b5acd920454","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5a68030-d5ea-442a-bece-ec16f32c22b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-2b5acd920454
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78b8cdc9-f4ef-49e3-aaa9-c285c68161cb","handle":"qa-2b5acd920454","displayName":"QA 2b5acd920454","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.457905747Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c88d86ce-e8eb-4e38-ab4c-63d778c6806b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c88d86ce-e8eb-4e38-ab4c-63d778c6806b
Content-Type: application/json

--- request body ---
{"handle":"qa-4409566696a8","displayName":"QA 4409566696a8","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c88d86ce-e8eb-4e38-ab4c-63d778c6806b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-4409566696a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24dad0de-ec06-414c-9bbc-c47ca5788f7e","handle":"qa-4409566696a8","displayName":"QA 4409566696a8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.491235058Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-196a834c-91ba-4d6d-ab37-ba82ce4e4ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-196a834c-91ba-4d6d-ab37-ba82ce4e4ba4
Content-Type: application/json

--- request body ---
{"handle":"qa-2b5acd920454","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-196a834c-91ba-4d6d-ab37-ba82ce4e4ba4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78b8cdc9-f4ef-49e3-aaa9-c285c68161cb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-de575adf-b60b-4a2e-84ee-91f27640b251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de575adf-b60b-4a2e-84ee-91f27640b251
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4409566696a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-de575adf-b60b-4a2e-84ee-91f27640b251
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
Location: /v1/conversations/cnv_6859852b-135f-4a2f-be4a-9832d3e41a99
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6859852b-135f-4a2f-be4a-9832d3e41a99","subject":"Error contract","status":"open","region":"eu","participants":["qa-2b5acd920454","qa-4409566696a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.568334944Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-2b5acd920454
correlation: qa-44a8012a-4b0d-4751-be51-0f24ab420322

--- request headers ---
Accept: application/json
X-Fault-Key: f314e148-38f0-42b3-8dcc-19d41cae8a5f
X-Fault: unavailable-once
X-Correlation-Id: qa-44a8012a-4b0d-4751-be51-0f24ab420322
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44a8012a-4b0d-4751-be51-0f24ab420322
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-2b5acd920454","correlationId":"qa-44a8012a-4b0d-4751-be51-0f24ab420322"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a63e2486-b69a-40e2-a500-67264508a899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a63e2486-b69a-40e2-a500-67264508a899
Content-Type: application/json

--- request body ---
{"handle":"qa-4409566696a8","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a63e2486-b69a-40e2-a500-67264508a899
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24dad0de-ec06-414c-9bbc-c47ca5788f7e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7935dd16-ac69-4210-b1fd-ec703706613d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7935dd16-ac69-4210-b1fd-ec703706613d
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7935dd16-ac69-4210-b1fd-ec703706613d
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
correlation: qa-3d30a6bf-34a9-4698-9938-18bc07619660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d30a6bf-34a9-4698-9938-18bc07619660
Content-Type: application/json

--- request body ---
{"handle":"qa-4409566696a8","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d30a6bf-34a9-4698-9938-18bc07619660
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d30a6bf-34a9-4698-9938-18bc07619660"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7045618b-a755-44b4-83a1-2cb6a09b23f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7045618b-a755-44b4-83a1-2cb6a09b23f8
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7045618b-a755-44b4-83a1-2cb6a09b23f8
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
correlation: qa-2d4188f1-8ddf-4a51-93be-74c1f1daa5d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d4188f1-8ddf-4a51-93be-74c1f1daa5d0
Content-Type: application/json

--- request body ---
{"handle":"qa-2b5acd920454","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d4188f1-8ddf-4a51-93be-74c1f1daa5d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d4188f1-8ddf-4a51-93be-74c1f1daa5d0"}
```
