# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-e2867bef-cd27-4f22-ab11-801eabe74803` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-374b3558-58e7-45b6-9b20-5ef454e5e51a` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-c6854cc4-83d9-4ae7-aefd-b9ee8ed509b5` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-041341fb-4fb6-446a-bff4-7cd2b498731a` |
| 5 | `POST /v1/conversations` | 422 | 35 | `qa-48ed518c-1f88-4b1d-9078-8f3b809f5a65` |
| 6 | `POST /v1/auth/token` | 200 | 61 | `qa-90cff428-fa56-45ac-85c7-16afb6f80b96` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-8b4c69f3-d42e-48d4-8236-19973e8a2b49` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-ab9c52d0-8db3-4c21-8b3d-e79cd01f21c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-cdd10c2a-fd9e-4704-8432-8f4b269e4232` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-e1bcbc1d-f874-4398-8750-ea19a10bb46b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2867bef-cd27-4f22-ab11-801eabe74803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2867bef-cd27-4f22-ab11-801eabe74803
Content-Type: application/json

--- request body ---
{"handle":"qa-d9ef1aa29000","displayName":"QA d9ef1aa29000","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2867bef-cd27-4f22-ab11-801eabe74803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-d9ef1aa29000
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2709bbee-7e9e-4eb9-858d-5c5bb9dd27e0","handle":"qa-d9ef1aa29000","displayName":"QA d9ef1aa29000","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.083700274Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-374b3558-58e7-45b6-9b20-5ef454e5e51a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374b3558-58e7-45b6-9b20-5ef454e5e51a
Content-Type: application/json

--- request body ---
{"handle":"qa-baa14a8b9df3","displayName":"QA baa14a8b9df3","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-374b3558-58e7-45b6-9b20-5ef454e5e51a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-baa14a8b9df3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc2fc6a5-c655-4b01-9fc1-e590bce0351a","handle":"qa-baa14a8b9df3","displayName":"QA baa14a8b9df3","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.129202026Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6854cc4-83d9-4ae7-aefd-b9ee8ed509b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6854cc4-83d9-4ae7-aefd-b9ee8ed509b5
Content-Type: application/json

--- request body ---
{"handle":"qa-d9ef1aa29000","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6854cc4-83d9-4ae7-aefd-b9ee8ed509b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2709bbee-7e9e-4eb9-858d-5c5bb9dd27e0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-041341fb-4fb6-446a-bff4-7cd2b498731a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-041341fb-4fb6-446a-bff4-7cd2b498731a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-baa14a8b9df3","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-041341fb-4fb6-446a-bff4-7cd2b498731a
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
Location: /v1/conversations/cnv_5b68e741-0c6c-4bcd-9dc1-edd17e5b1053
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5b68e741-0c6c-4bcd-9dc1-edd17e5b1053","subject":"Error contract","status":"open","region":"eu","participants":["qa-d9ef1aa29000","qa-baa14a8b9df3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.199650037Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-48ed518c-1f88-4b1d-9078-8f3b809f5a65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ed518c-1f88-4b1d-9078-8f3b809f5a65
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-baa14a8b9df3","subject":" ","message":"Hi"}

--- response: 422 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48ed518c-1f88-4b1d-9078-8f3b809f5a65
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-48ed518c-1f88-4b1d-9078-8f3b809f5a65","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-90cff428-fa56-45ac-85c7-16afb6f80b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90cff428-fa56-45ac-85c7-16afb6f80b96
Content-Type: application/json

--- request body ---
{"handle":"qa-baa14a8b9df3","password":"****"}

--- response: 200 in 61 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-90cff428-fa56-45ac-85c7-16afb6f80b96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc2fc6a5-c655-4b01-9fc1-e590bce0351a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b4c69f3-d42e-48d4-8236-19973e8a2b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4c69f3-d42e-48d4-8236-19973e8a2b49
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b4c69f3-d42e-48d4-8236-19973e8a2b49
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
correlation: qa-ab9c52d0-8db3-4c21-8b3d-e79cd01f21c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab9c52d0-8db3-4c21-8b3d-e79cd01f21c5
Content-Type: application/json

--- request body ---
{"handle":"qa-baa14a8b9df3","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab9c52d0-8db3-4c21-8b3d-e79cd01f21c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab9c52d0-8db3-4c21-8b3d-e79cd01f21c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cdd10c2a-fd9e-4704-8432-8f4b269e4232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdd10c2a-fd9e-4704-8432-8f4b269e4232
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cdd10c2a-fd9e-4704-8432-8f4b269e4232
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
correlation: qa-e1bcbc1d-f874-4398-8750-ea19a10bb46b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1bcbc1d-f874-4398-8750-ea19a10bb46b
Content-Type: application/json

--- request body ---
{"handle":"qa-d9ef1aa29000","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1bcbc1d-f874-4398-8750-ea19a10bb46b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1bcbc1d-f874-4398-8750-ea19a10bb46b"}
```
