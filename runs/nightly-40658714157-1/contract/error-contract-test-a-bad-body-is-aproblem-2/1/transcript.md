# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-edf4090b-5c07-4300-affd-910ffb9d6e70` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-6c36d14a-9622-4819-9d6c-b9a875ebbbb1` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-75cc3bc3-f77c-48b9-8fa6-cb35b0caa91b` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-1e13775f-e71c-4012-99b9-195d6da74abf` |
| 5 | `POST /v1/auth/token` | 422 | 41 | `qa-2f0a928a-61c5-45ac-bcc6-4b5f3cdbf980` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-5c176e66-50ee-4db8-b277-6125f8e7cb32` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-8cb52a2d-33aa-4cf5-bd81-131aa44993b3` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-997a7197-a533-45f1-bc28-592fbd60b899` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-99129159-e95d-4a93-bd86-c57e9588d74f` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-12ca529a-541d-4825-9b38-495a1c2998c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-edf4090b-5c07-4300-affd-910ffb9d6e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edf4090b-5c07-4300-affd-910ffb9d6e70
Content-Type: application/json

--- request body ---
{"handle":"qa-655dcf877136","displayName":"QA 655dcf877136","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-edf4090b-5c07-4300-affd-910ffb9d6e70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-655dcf877136
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2face8c5-dc86-4d45-b834-598ce286ae51","handle":"qa-655dcf877136","displayName":"QA 655dcf877136","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.335702218Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c36d14a-9622-4819-9d6c-b9a875ebbbb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c36d14a-9622-4819-9d6c-b9a875ebbbb1
Content-Type: application/json

--- request body ---
{"handle":"qa-20d78906c5cf","displayName":"QA 20d78906c5cf","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c36d14a-9622-4819-9d6c-b9a875ebbbb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-20d78906c5cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7cd3c1fc-6ff9-48c0-b007-d72bbb50f4e1","handle":"qa-20d78906c5cf","displayName":"QA 20d78906c5cf","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.357927080Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-75cc3bc3-f77c-48b9-8fa6-cb35b0caa91b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75cc3bc3-f77c-48b9-8fa6-cb35b0caa91b
Content-Type: application/json

--- request body ---
{"handle":"qa-655dcf877136","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-75cc3bc3-f77c-48b9-8fa6-cb35b0caa91b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2face8c5-dc86-4d45-b834-598ce286ae51"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e13775f-e71c-4012-99b9-195d6da74abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e13775f-e71c-4012-99b9-195d6da74abf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-20d78906c5cf","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e13775f-e71c-4012-99b9-195d6da74abf
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
Location: /v1/conversations/cnv_a5c027ff-dc46-487a-818b-94593f1ef27d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a5c027ff-dc46-487a-818b-94593f1ef27d","subject":"Error contract","status":"open","region":"eu","participants":["qa-655dcf877136","qa-20d78906c5cf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.410136739Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2f0a928a-61c5-45ac-bcc6-4b5f3cdbf980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f0a928a-61c5-45ac-bcc6-4b5f3cdbf980
Content-Type: application/json

--- request body ---
{"handle":"qa-655dcf877136","password":"****","ttlSeconds":0}

--- response: 422 in 41 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f0a928a-61c5-45ac-bcc6-4b5f3cdbf980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-2f0a928a-61c5-45ac-bcc6-4b5f3cdbf980","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c176e66-50ee-4db8-b277-6125f8e7cb32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c176e66-50ee-4db8-b277-6125f8e7cb32
Content-Type: application/json

--- request body ---
{"handle":"qa-20d78906c5cf","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c176e66-50ee-4db8-b277-6125f8e7cb32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7cd3c1fc-6ff9-48c0-b007-d72bbb50f4e1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cb52a2d-33aa-4cf5-bd81-131aa44993b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb52a2d-33aa-4cf5-bd81-131aa44993b3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cb52a2d-33aa-4cf5-bd81-131aa44993b3
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
correlation: qa-997a7197-a533-45f1-bc28-592fbd60b899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997a7197-a533-45f1-bc28-592fbd60b899
Content-Type: application/json

--- request body ---
{"handle":"qa-20d78906c5cf","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-997a7197-a533-45f1-bc28-592fbd60b899
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-997a7197-a533-45f1-bc28-592fbd60b899"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99129159-e95d-4a93-bd86-c57e9588d74f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99129159-e95d-4a93-bd86-c57e9588d74f
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99129159-e95d-4a93-bd86-c57e9588d74f
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
correlation: qa-12ca529a-541d-4825-9b38-495a1c2998c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12ca529a-541d-4825-9b38-495a1c2998c8
Content-Type: application/json

--- request body ---
{"handle":"qa-655dcf877136","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12ca529a-541d-4825-9b38-495a1c2998c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12ca529a-541d-4825-9b38-495a1c2998c8"}
```
