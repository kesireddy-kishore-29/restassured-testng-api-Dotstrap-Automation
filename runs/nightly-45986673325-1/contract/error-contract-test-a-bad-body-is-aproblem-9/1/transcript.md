# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-ece1c98e-6ebf-4a62-9676-24f5b081ace4` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-340f7a66-7f65-4480-97b8-fcb746bfa6a1` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-9f925c39-b21e-4952-9490-1a8e95a05865` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-4d65aa9c-9290-47cb-a5df-d316bf8ecdd4` |
| 5 | `POST /v1/conversations` | 400 | 20 | `qa-a80c4bcb-8ca8-40fa-9200-bf889729808e` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-3d29851b-b195-4a70-832f-e51f1df6a926` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-2ca4e383-0850-4c48-8d17-78ce0dde8d44` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-c76d69fe-ef52-4579-b94d-825ee4122a02` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-70f11346-6b8a-4769-b08a-ad82593e3e85` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-e847210b-d426-4d74-8b53-5633101a0af5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ece1c98e-6ebf-4a62-9676-24f5b081ace4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ece1c98e-6ebf-4a62-9676-24f5b081ace4
Content-Type: application/json

--- request body ---
{"handle":"qa-cb69713340ce","displayName":"QA cb69713340ce","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ece1c98e-6ebf-4a62-9676-24f5b081ace4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-cb69713340ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce86890d-43e2-4433-a906-32026a0f9808","handle":"qa-cb69713340ce","displayName":"QA cb69713340ce","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.189896402Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-340f7a66-7f65-4480-97b8-fcb746bfa6a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-340f7a66-7f65-4480-97b8-fcb746bfa6a1
Content-Type: application/json

--- request body ---
{"handle":"qa-d581fbe7e8e2","displayName":"QA d581fbe7e8e2","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-340f7a66-7f65-4480-97b8-fcb746bfa6a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Location: /v1/accounts/qa-d581fbe7e8e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_639e3043-3b8a-4881-9bf0-836099fded15","handle":"qa-d581fbe7e8e2","displayName":"QA d581fbe7e8e2","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.231685839Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9f925c39-b21e-4952-9490-1a8e95a05865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f925c39-b21e-4952-9490-1a8e95a05865
Content-Type: application/json

--- request body ---
{"handle":"qa-cb69713340ce","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f925c39-b21e-4952-9490-1a8e95a05865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce86890d-43e2-4433-a906-32026a0f9808"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4d65aa9c-9290-47cb-a5df-d316bf8ecdd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d65aa9c-9290-47cb-a5df-d316bf8ecdd4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d581fbe7e8e2","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d65aa9c-9290-47cb-a5df-d316bf8ecdd4
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
Location: /v1/conversations/cnv_8e38b158-5738-4793-bee5-5968b5f47800
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8e38b158-5738-4793-bee5-5968b5f47800","subject":"Error contract","status":"open","region":"eu","participants":["qa-cb69713340ce","qa-d581fbe7e8e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.279264911Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a80c4bcb-8ca8-40fa-9200-bf889729808e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a80c4bcb-8ca8-40fa-9200-bf889729808e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a80c4bcb-8ca8-40fa-9200-bf889729808e
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-a80c4bcb-8ca8-40fa-9200-bf889729808e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3d29851b-b195-4a70-832f-e51f1df6a926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d29851b-b195-4a70-832f-e51f1df6a926
Content-Type: application/json

--- request body ---
{"handle":"qa-d581fbe7e8e2","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d29851b-b195-4a70-832f-e51f1df6a926
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_639e3043-3b8a-4881-9bf0-836099fded15"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ca4e383-0850-4c48-8d17-78ce0dde8d44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ca4e383-0850-4c48-8d17-78ce0dde8d44
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ca4e383-0850-4c48-8d17-78ce0dde8d44
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
correlation: qa-c76d69fe-ef52-4579-b94d-825ee4122a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c76d69fe-ef52-4579-b94d-825ee4122a02
Content-Type: application/json

--- request body ---
{"handle":"qa-d581fbe7e8e2","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c76d69fe-ef52-4579-b94d-825ee4122a02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c76d69fe-ef52-4579-b94d-825ee4122a02"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70f11346-6b8a-4769-b08a-ad82593e3e85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f11346-6b8a-4769-b08a-ad82593e3e85
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70f11346-6b8a-4769-b08a-ad82593e3e85
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
correlation: qa-e847210b-d426-4d74-8b53-5633101a0af5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e847210b-d426-4d74-8b53-5633101a0af5
Content-Type: application/json

--- request body ---
{"handle":"qa-cb69713340ce","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e847210b-d426-4d74-8b53-5633101a0af5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e847210b-d426-4d74-8b53-5633101a0af5"}
```
