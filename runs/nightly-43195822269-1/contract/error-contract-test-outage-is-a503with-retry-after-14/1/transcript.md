# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-05e0bc64-7542-4b1a-93a2-84df6415226c` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-fb0e31d9-6638-405c-9e8d-a23764fe3219` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-5bcfea23-20be-4379-941e-25744c2221dc` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-779f12df-0620-481f-8507-2af575aa59f9` |
| 5 | `GET /v1/credits/ledger` | 503 | 7 | `qa-a4310761-28f8-4734-9afc-eaf205c4723d` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-eb2a6453-5a79-4671-a942-7b9450aaedad` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-47200d0c-5f7a-4265-9bd2-d58e91854652` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-13c866ef-7df3-4f36-b183-9f042769f6f0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7249280e-dd66-4e09-ac59-fb3b202aa1ab` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-0e9630fd-ec4f-46db-8786-297f7a65b9b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-05e0bc64-7542-4b1a-93a2-84df6415226c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e0bc64-7542-4b1a-93a2-84df6415226c
Content-Type: application/json

--- request body ---
{"handle":"qa-875ac393d438","displayName":"QA 875ac393d438","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-05e0bc64-7542-4b1a-93a2-84df6415226c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-875ac393d438
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1dfe8567-9718-4a8f-a218-e565d1e2996c","handle":"qa-875ac393d438","displayName":"QA 875ac393d438","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.874857939Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fb0e31d9-6638-405c-9e8d-a23764fe3219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb0e31d9-6638-405c-9e8d-a23764fe3219
Content-Type: application/json

--- request body ---
{"handle":"qa-28650c2a77fc","displayName":"QA 28650c2a77fc","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb0e31d9-6638-405c-9e8d-a23764fe3219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Location: /v1/accounts/qa-28650c2a77fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb58d02f-ea34-488c-8b8c-0351d0ed6e92","handle":"qa-28650c2a77fc","displayName":"QA 28650c2a77fc","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.891538204Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5bcfea23-20be-4379-941e-25744c2221dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bcfea23-20be-4379-941e-25744c2221dc
Content-Type: application/json

--- request body ---
{"handle":"qa-875ac393d438","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bcfea23-20be-4379-941e-25744c2221dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1dfe8567-9718-4a8f-a218-e565d1e2996c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-779f12df-0620-481f-8507-2af575aa59f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-779f12df-0620-481f-8507-2af575aa59f9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-28650c2a77fc","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-779f12df-0620-481f-8507-2af575aa59f9
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
Location: /v1/conversations/cnv_d9aa1fdb-9431-4a5c-9807-de55236e25df
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d9aa1fdb-9431-4a5c-9807-de55236e25df","subject":"Error contract","status":"open","region":"eu","participants":["qa-875ac393d438","qa-28650c2a77fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.942919839Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a4310761-28f8-4734-9afc-eaf205c4723d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e5064d14-b80b-4a3f-9156-8b8636888464
X-Correlation-Id: qa-a4310761-28f8-4734-9afc-eaf205c4723d
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4310761-28f8-4734-9afc-eaf205c4723d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-a4310761-28f8-4734-9afc-eaf205c4723d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eb2a6453-5a79-4671-a942-7b9450aaedad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2a6453-5a79-4671-a942-7b9450aaedad
Content-Type: application/json

--- request body ---
{"handle":"qa-28650c2a77fc","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb2a6453-5a79-4671-a942-7b9450aaedad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb58d02f-ea34-488c-8b8c-0351d0ed6e92"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47200d0c-5f7a-4265-9bd2-d58e91854652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47200d0c-5f7a-4265-9bd2-d58e91854652
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47200d0c-5f7a-4265-9bd2-d58e91854652
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
correlation: qa-13c866ef-7df3-4f36-b183-9f042769f6f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13c866ef-7df3-4f36-b183-9f042769f6f0
Content-Type: application/json

--- request body ---
{"handle":"qa-28650c2a77fc","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13c866ef-7df3-4f36-b183-9f042769f6f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13c866ef-7df3-4f36-b183-9f042769f6f0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7249280e-dd66-4e09-ac59-fb3b202aa1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7249280e-dd66-4e09-ac59-fb3b202aa1ab
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7249280e-dd66-4e09-ac59-fb3b202aa1ab
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
correlation: qa-0e9630fd-ec4f-46db-8786-297f7a65b9b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e9630fd-ec4f-46db-8786-297f7a65b9b7
Content-Type: application/json

--- request body ---
{"handle":"qa-875ac393d438","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e9630fd-ec4f-46db-8786-297f7a65b9b7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e9630fd-ec4f-46db-8786-297f7a65b9b7"}
```
