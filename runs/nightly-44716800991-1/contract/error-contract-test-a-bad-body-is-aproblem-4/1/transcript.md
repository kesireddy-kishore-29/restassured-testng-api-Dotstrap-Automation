# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 69 | `qa-d3fa8f9c-0ba4-4bee-98b1-eaceaadf0f85` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-cbf12e7d-f1dd-492c-a1c3-7f80ed3591d1` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-b0008e7c-655a-471c-9cc4-422a2a04601c` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-7543803c-39cf-4cb7-8e13-d9333f4ea574` |
| 5 | `POST /v1/accounts` | 415 | 18 | `qa-c1cd20d8-15f1-4501-b6bd-4e0c6f547fb2` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-07fa7850-698c-4355-ae8b-efba90f43653` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-4bd64b78-b940-4e8e-9d69-9280c5efc9fd` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-31ffc335-7d19-44b2-a0bf-53af7bccbf5c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0c41b4b1-38aa-4450-aed4-c561447cd10c` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-418dc3f2-8e2b-44fa-8192-8024cad5d5e8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d3fa8f9c-0ba4-4bee-98b1-eaceaadf0f85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3fa8f9c-0ba4-4bee-98b1-eaceaadf0f85
Content-Type: application/json

--- request body ---
{"handle":"qa-7dc8512df232","displayName":"QA 7dc8512df232","password":"****","region":"eu"}

--- response: 201 in 69 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3fa8f9c-0ba4-4bee-98b1-eaceaadf0f85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-7dc8512df232
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6dc223e4-62d7-48c8-81e7-a470a8ac2984","handle":"qa-7dc8512df232","displayName":"QA 7dc8512df232","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.166379460Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cbf12e7d-f1dd-492c-a1c3-7f80ed3591d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf12e7d-f1dd-492c-a1c3-7f80ed3591d1
Content-Type: application/json

--- request body ---
{"handle":"qa-724d4a81cf2a","displayName":"QA 724d4a81cf2a","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbf12e7d-f1dd-492c-a1c3-7f80ed3591d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-724d4a81cf2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8255b9a7-26fe-4863-95d2-36e3a766b8f1","handle":"qa-724d4a81cf2a","displayName":"QA 724d4a81cf2a","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.250109791Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b0008e7c-655a-471c-9cc4-422a2a04601c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0008e7c-655a-471c-9cc4-422a2a04601c
Content-Type: application/json

--- request body ---
{"handle":"qa-7dc8512df232","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0008e7c-655a-471c-9cc4-422a2a04601c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6dc223e4-62d7-48c8-81e7-a470a8ac2984"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7543803c-39cf-4cb7-8e13-d9333f4ea574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7543803c-39cf-4cb7-8e13-d9333f4ea574
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-724d4a81cf2a","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7543803c-39cf-4cb7-8e13-d9333f4ea574
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
Location: /v1/conversations/cnv_7ee5b61c-6c7f-41d0-9b57-2745f8805ce0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7ee5b61c-6c7f-41d0-9b57-2745f8805ce0","subject":"Error contract","status":"open","region":"eu","participants":["qa-7dc8512df232","qa-724d4a81cf2a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.395016401Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c1cd20d8-15f1-4501-b6bd-4e0c6f547fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1cd20d8-15f1-4501-b6bd-4e0c6f547fb2
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1cd20d8-15f1-4501-b6bd-4e0c6f547fb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-c1cd20d8-15f1-4501-b6bd-4e0c6f547fb2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-07fa7850-698c-4355-ae8b-efba90f43653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07fa7850-698c-4355-ae8b-efba90f43653
Content-Type: application/json

--- request body ---
{"handle":"qa-724d4a81cf2a","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-07fa7850-698c-4355-ae8b-efba90f43653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8255b9a7-26fe-4863-95d2-36e3a766b8f1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bd64b78-b940-4e8e-9d69-9280c5efc9fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bd64b78-b940-4e8e-9d69-9280c5efc9fd
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bd64b78-b940-4e8e-9d69-9280c5efc9fd
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
correlation: qa-31ffc335-7d19-44b2-a0bf-53af7bccbf5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ffc335-7d19-44b2-a0bf-53af7bccbf5c
Content-Type: application/json

--- request body ---
{"handle":"qa-724d4a81cf2a","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31ffc335-7d19-44b2-a0bf-53af7bccbf5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31ffc335-7d19-44b2-a0bf-53af7bccbf5c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c41b4b1-38aa-4450-aed4-c561447cd10c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c41b4b1-38aa-4450-aed4-c561447cd10c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c41b4b1-38aa-4450-aed4-c561447cd10c
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
correlation: qa-418dc3f2-8e2b-44fa-8192-8024cad5d5e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-418dc3f2-8e2b-44fa-8192-8024cad5d5e8
Content-Type: application/json

--- request body ---
{"handle":"qa-7dc8512df232","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-418dc3f2-8e2b-44fa-8192-8024cad5d5e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-418dc3f2-8e2b-44fa-8192-8024cad5d5e8"}
```
