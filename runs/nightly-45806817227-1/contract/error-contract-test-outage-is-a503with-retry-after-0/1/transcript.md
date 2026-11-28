# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-1a3d4dd5-3cd6-4228-8231-de660f13df1b` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-2afbd13b-6ee0-4c4c-9baf-9260819fb940` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-18e1f740-0b77-43c0-a0fa-712d2aaae321` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-aa7de391-677a-408e-8106-1d85c7a897b7` |
| 5 | `POST /v1/auth/token` | 503 | 6 | `qa-29abbe20-788e-4470-ba2d-817ce537aecb` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-a7d5812f-20ca-4e66-9e35-b17bcd6ebb00` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-ecde7e31-96b2-4497-8ee0-04025f6802a5` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-5b5eadb3-6d38-475a-a7ca-6c2433ddddc6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-bff2a549-e5a4-494e-8738-06bb45d96cd4` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-f7899665-3ef6-4eff-91cc-b352686b37c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1a3d4dd5-3cd6-4228-8231-de660f13df1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a3d4dd5-3cd6-4228-8231-de660f13df1b
Content-Type: application/json

--- request body ---
{"handle":"qa-73bbd1406b1d","displayName":"QA 73bbd1406b1d","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a3d4dd5-3cd6-4228-8231-de660f13df1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-73bbd1406b1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f7f4ce0-5b98-4389-9f5d-be09bf7fa864","handle":"qa-73bbd1406b1d","displayName":"QA 73bbd1406b1d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.624256568Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2afbd13b-6ee0-4c4c-9baf-9260819fb940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2afbd13b-6ee0-4c4c-9baf-9260819fb940
Content-Type: application/json

--- request body ---
{"handle":"qa-ef5b5bd21a1a","displayName":"QA ef5b5bd21a1a","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2afbd13b-6ee0-4c4c-9baf-9260819fb940
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Location: /v1/accounts/qa-ef5b5bd21a1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ebb7a896-456a-4481-b643-74d20ca1c5f8","handle":"qa-ef5b5bd21a1a","displayName":"QA ef5b5bd21a1a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.691140550Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-18e1f740-0b77-43c0-a0fa-712d2aaae321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e1f740-0b77-43c0-a0fa-712d2aaae321
Content-Type: application/json

--- request body ---
{"handle":"qa-73bbd1406b1d","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-18e1f740-0b77-43c0-a0fa-712d2aaae321
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f7f4ce0-5b98-4389-9f5d-be09bf7fa864"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aa7de391-677a-408e-8106-1d85c7a897b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa7de391-677a-408e-8106-1d85c7a897b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ef5b5bd21a1a","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa7de391-677a-408e-8106-1d85c7a897b7
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
Location: /v1/conversations/cnv_eaf363ea-99f5-4f15-8b6d-1f58d8e54e87
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eaf363ea-99f5-4f15-8b6d-1f58d8e54e87","subject":"Error contract","status":"open","region":"eu","participants":["qa-73bbd1406b1d","qa-ef5b5bd21a1a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.785314488Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-29abbe20-788e-4470-ba2d-817ce537aecb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5b4f6d1c-d6e3-4b97-8194-4e0b10b9cf1c
X-Correlation-Id: qa-29abbe20-788e-4470-ba2d-817ce537aecb
Content-Type: application/json

--- request body ---
{"handle":"qa-73bbd1406b1d","password":"****"}

--- response: 503 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29abbe20-788e-4470-ba2d-817ce537aecb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-29abbe20-788e-4470-ba2d-817ce537aecb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a7d5812f-20ca-4e66-9e35-b17bcd6ebb00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7d5812f-20ca-4e66-9e35-b17bcd6ebb00
Content-Type: application/json

--- request body ---
{"handle":"qa-ef5b5bd21a1a","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7d5812f-20ca-4e66-9e35-b17bcd6ebb00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ebb7a896-456a-4481-b643-74d20ca1c5f8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecde7e31-96b2-4497-8ee0-04025f6802a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecde7e31-96b2-4497-8ee0-04025f6802a5
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecde7e31-96b2-4497-8ee0-04025f6802a5
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
correlation: qa-5b5eadb3-6d38-475a-a7ca-6c2433ddddc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b5eadb3-6d38-475a-a7ca-6c2433ddddc6
Content-Type: application/json

--- request body ---
{"handle":"qa-ef5b5bd21a1a","password":"****"}

--- response: 401 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b5eadb3-6d38-475a-a7ca-6c2433ddddc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b5eadb3-6d38-475a-a7ca-6c2433ddddc6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bff2a549-e5a4-494e-8738-06bb45d96cd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff2a549-e5a4-494e-8738-06bb45d96cd4
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bff2a549-e5a4-494e-8738-06bb45d96cd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f7899665-3ef6-4eff-91cc-b352686b37c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7899665-3ef6-4eff-91cc-b352686b37c0
Content-Type: application/json

--- request body ---
{"handle":"qa-73bbd1406b1d","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7899665-3ef6-4eff-91cc-b352686b37c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7899665-3ef6-4eff-91cc-b352686b37c0"}
```
