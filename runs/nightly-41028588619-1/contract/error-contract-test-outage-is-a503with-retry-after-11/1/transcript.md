# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-97f85db5-8146-47ba-b4ab-a1dbfa6bf05e` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-155899f3-46ab-43bd-87c1-50ab225c9775` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-e9fa8b29-5f62-4f25-b3f5-aa7460996e5d` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-e9cc7109-edac-4c19-9b66-432001d9e752` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 20 | `qa-7e24ba3f-ac88-4183-84f5-fbbfe9eb651e` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-c0eb889b-f012-4363-b34d-4b1d1da1ea26` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-16e1b7e7-95c0-4d34-ac7e-d5e80caafe61` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-f6e2b87d-f1c1-405e-ae7c-f8a175e5c025` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-65791afc-9976-40d5-8c78-a2e6a2134606` |
| 10 | `POST /v1/auth/token` | 401 | 40 | `qa-5d3dcfec-3936-4290-ae6c-f4e42b656427` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97f85db5-8146-47ba-b4ab-a1dbfa6bf05e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97f85db5-8146-47ba-b4ab-a1dbfa6bf05e
Content-Type: application/json

--- request body ---
{"handle":"qa-b107e7c2c1fb","displayName":"QA b107e7c2c1fb","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-97f85db5-8146-47ba-b4ab-a1dbfa6bf05e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Location: /v1/accounts/qa-b107e7c2c1fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be4eee84-5bf5-4d4f-8bc1-26bd64d7a801","handle":"qa-b107e7c2c1fb","displayName":"QA b107e7c2c1fb","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.494987656Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-155899f3-46ab-43bd-87c1-50ab225c9775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-155899f3-46ab-43bd-87c1-50ab225c9775
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9247d0ab06","displayName":"QA fc9247d0ab06","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-155899f3-46ab-43bd-87c1-50ab225c9775
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Location: /v1/accounts/qa-fc9247d0ab06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be40c201-6a9a-4f05-89b8-fac047b9f206","handle":"qa-fc9247d0ab06","displayName":"QA fc9247d0ab06","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.564332145Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e9fa8b29-5f62-4f25-b3f5-aa7460996e5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9fa8b29-5f62-4f25-b3f5-aa7460996e5d
Content-Type: application/json

--- request body ---
{"handle":"qa-b107e7c2c1fb","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9fa8b29-5f62-4f25-b3f5-aa7460996e5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be4eee84-5bf5-4d4f-8bc1-26bd64d7a801"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e9cc7109-edac-4c19-9b66-432001d9e752

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9cc7109-edac-4c19-9b66-432001d9e752
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fc9247d0ab06","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9cc7109-edac-4c19-9b66-432001d9e752
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
Location: /v1/conversations/cnv_56e5314d-fb9e-4c55-a184-cd01595b1223
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_56e5314d-fb9e-4c55-a184-cd01595b1223","subject":"Error contract","status":"open","region":"eu","participants":["qa-b107e7c2c1fb","qa-fc9247d0ab06"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.656568876Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_56e5314d-fb9e-4c55-a184-cd01595b1223/read
correlation: qa-7e24ba3f-ac88-4183-84f5-fbbfe9eb651e

--- request headers ---
Accept: application/json
X-Fault-Key: 52e20295-1fc1-4d55-b8ee-726887ff4239
X-Fault: unavailable-once
X-Correlation-Id: qa-7e24ba3f-ac88-4183-84f5-fbbfe9eb651e
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e24ba3f-ac88-4183-84f5-fbbfe9eb651e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_56e5314d-fb9e-4c55-a184-cd01595b1223/read","correlationId":"qa-7e24ba3f-ac88-4183-84f5-fbbfe9eb651e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c0eb889b-f012-4363-b34d-4b1d1da1ea26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0eb889b-f012-4363-b34d-4b1d1da1ea26
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9247d0ab06","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0eb889b-f012-4363-b34d-4b1d1da1ea26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be40c201-6a9a-4f05-89b8-fac047b9f206"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16e1b7e7-95c0-4d34-ac7e-d5e80caafe61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16e1b7e7-95c0-4d34-ac7e-d5e80caafe61
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16e1b7e7-95c0-4d34-ac7e-d5e80caafe61
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
correlation: qa-f6e2b87d-f1c1-405e-ae7c-f8a175e5c025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e2b87d-f1c1-405e-ae7c-f8a175e5c025
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9247d0ab06","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6e2b87d-f1c1-405e-ae7c-f8a175e5c025
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6e2b87d-f1c1-405e-ae7c-f8a175e5c025"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65791afc-9976-40d5-8c78-a2e6a2134606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65791afc-9976-40d5-8c78-a2e6a2134606
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65791afc-9976-40d5-8c78-a2e6a2134606
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
correlation: qa-5d3dcfec-3936-4290-ae6c-f4e42b656427

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d3dcfec-3936-4290-ae6c-f4e42b656427
Content-Type: application/json

--- request body ---
{"handle":"qa-b107e7c2c1fb","password":"****"}

--- response: 401 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d3dcfec-3936-4290-ae6c-f4e42b656427
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5d3dcfec-3936-4290-ae6c-f4e42b656427"}
```
