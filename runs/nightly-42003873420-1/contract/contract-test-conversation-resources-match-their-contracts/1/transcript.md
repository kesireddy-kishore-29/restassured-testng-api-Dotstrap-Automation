# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 389 | `qa-319f0f3c-1144-41e1-ab36-ef744134b152` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-9ea03a8d-e6dd-4ede-b28e-3c70344816b7` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-af273aa6-1f0d-402b-b6ce-c420155e20c3` |
| 4 | `POST /v1/conversations` | 201 | 67 | `qa-5ba64bad-f9c1-4516-b350-66f735b3c791` |
| 5 | `GET /v1/conversations` | 200 | 30 | `qa-464aadba-0ec3-44d8-80b9-c25e5830483f` |
| 6 | `GET /v1/conversations/{id}` | 200 | 21 | `qa-44fbd77e-152b-4fdd-9d70-99892df60a22` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 26 | `qa-37268047-0162-4595-a855-5ba65b290812` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-582599dd-e363-4a14-a6ea-06d370cb6cac` |
| 9 | `POST /v1/auth/token` | 200 | 24 | `qa-151b3f18-ae01-48f4-9bfa-cfae142be51e` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 24 | `qa-9e12003c-9a5e-44a2-8be1-b2f58c742085` |
| 11 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-aa9e08db-15ef-46ad-a56f-313c130a71e4` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-18629ec0-9a54-4c5f-9ebd-e8f81ab0ec12` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1be1cd24-0169-4461-89df-e3d86625c8db` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-7686262e-168c-4554-a308-b3ad7a9aa87d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-319f0f3c-1144-41e1-ab36-ef744134b152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-319f0f3c-1144-41e1-ab36-ef744134b152
Content-Type: application/json

--- request body ---
{"handle":"qa-000ad37a0d35","displayName":"QA 000ad37a0d35","password":"****","region":"eu"}

--- response: 201 in 389 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-319f0f3c-1144-41e1-ab36-ef744134b152
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-000ad37a0d35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19d8bda5-8a0d-410a-90bc-c00f750e308a","handle":"qa-000ad37a0d35","displayName":"QA 000ad37a0d35","region":"eu","role":"user","createdAt":"2026-11-05T09:37:52.596380441Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ea03a8d-e6dd-4ede-b28e-3c70344816b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ea03a8d-e6dd-4ede-b28e-3c70344816b7
Content-Type: application/json

--- request body ---
{"handle":"qa-89e473a56ea5","displayName":"QA 89e473a56ea5","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ea03a8d-e6dd-4ede-b28e-3c70344816b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-89e473a56ea5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f7a26b0-6ee1-4c64-94b2-f20e69af529e","handle":"qa-89e473a56ea5","displayName":"QA 89e473a56ea5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.073851211Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-af273aa6-1f0d-402b-b6ce-c420155e20c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af273aa6-1f0d-402b-b6ce-c420155e20c3
Content-Type: application/json

--- request body ---
{"handle":"qa-000ad37a0d35","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-af273aa6-1f0d-402b-b6ce-c420155e20c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19d8bda5-8a0d-410a-90bc-c00f750e308a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5ba64bad-f9c1-4516-b350-66f735b3c791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ba64bad-f9c1-4516-b350-66f735b3c791
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-89e473a56ea5","subject":"Contract check","message":"Hello"}

--- response: 201 in 67 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ba64bad-f9c1-4516-b350-66f735b3c791
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
Location: /v1/conversations/cnv_74562d0a-9f8c-4252-b096-26b5be5701a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","subject":"Contract check","status":"open","region":"eu","participants":["qa-000ad37a0d35","qa-89e473a56ea5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.260700754Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-464aadba-0ec3-44d8-80b9-c25e5830483f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-464aadba-0ec3-44d8-80b9-c25e5830483f
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-464aadba-0ec3-44d8-80b9-c25e5830483f
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
Content-Length: 259

{"items":[{"id":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","subject":"Contract check","status":"open","region":"eu","participants":["qa-000ad37a0d35","qa-89e473a56ea5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.260700754Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_74562d0a-9f8c-4252-b096-26b5be5701a5
correlation: qa-44fbd77e-152b-4fdd-9d70-99892df60a22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44fbd77e-152b-4fdd-9d70-99892df60a22
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-44fbd77e-152b-4fdd-9d70-99892df60a22
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","subject":"Contract check","status":"open","region":"eu","participants":["qa-000ad37a0d35","qa-89e473a56ea5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.260700754Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_74562d0a-9f8c-4252-b096-26b5be5701a5/messages
correlation: qa-37268047-0162-4595-a855-5ba65b290812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37268047-0162-4595-a855-5ba65b290812
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-37268047-0162-4595-a855-5ba65b290812
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_1e884082-d6e2-4a39-aa4b-a5f4b94f7480","conversationId":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","sender":"qa-000ad37a0d35","body":"Second","createdAt":"2026-11-05T09:37:53.435966734Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_74562d0a-9f8c-4252-b096-26b5be5701a5/messages
correlation: qa-582599dd-e363-4a14-a6ea-06d370cb6cac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-582599dd-e363-4a14-a6ea-06d370cb6cac
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-582599dd-e363-4a14-a6ea-06d370cb6cac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_a386cf42-ed36-42d6-85ff-80d34840a313","conversationId":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","sender":"qa-000ad37a0d35","body":"Hello","createdAt":"2026-11-05T09:37:53.260980277Z"},{"id":"msg_1e884082-d6e2-4a39-aa4b-a5f4b94f7480","conversationId":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","sender":"qa-000ad37a0d35","body":"Second","createdAt":"2026-11-05T09:37:53.435966734Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-151b3f18-ae01-48f4-9bfa-cfae142be51e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-151b3f18-ae01-48f4-9bfa-cfae142be51e
Content-Type: application/json

--- request body ---
{"handle":"qa-89e473a56ea5","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-151b3f18-ae01-48f4-9bfa-cfae142be51e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f7a26b0-6ee1-4c64-94b2-f20e69af529e"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_74562d0a-9f8c-4252-b096-26b5be5701a5/read
correlation: qa-9e12003c-9a5e-44a2-8be1-b2f58c742085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e12003c-9a5e-44a2-8be1-b2f58c742085
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e12003c-9a5e-44a2-8be1-b2f58c742085
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
Content-Length: 77

{"conversationId":"cnv_74562d0a-9f8c-4252-b096-26b5be5701a5","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa9e08db-15ef-46ad-a56f-313c130a71e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa9e08db-15ef-46ad-a56f-313c130a71e4
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa9e08db-15ef-46ad-a56f-313c130a71e4
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-18629ec0-9a54-4c5f-9ebd-e8f81ab0ec12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18629ec0-9a54-4c5f-9ebd-e8f81ab0ec12
Content-Type: application/json

--- request body ---
{"handle":"qa-89e473a56ea5","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18629ec0-9a54-4c5f-9ebd-e8f81ab0ec12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18629ec0-9a54-4c5f-9ebd-e8f81ab0ec12"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1be1cd24-0169-4461-89df-e3d86625c8db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1be1cd24-0169-4461-89df-e3d86625c8db
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1be1cd24-0169-4461-89df-e3d86625c8db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-7686262e-168c-4554-a308-b3ad7a9aa87d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7686262e-168c-4554-a308-b3ad7a9aa87d
Content-Type: application/json

--- request body ---
{"handle":"qa-000ad37a0d35","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7686262e-168c-4554-a308-b3ad7a9aa87d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7686262e-168c-4554-a308-b3ad7a9aa87d"}
```
