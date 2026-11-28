# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-7226915b-87dd-411b-8d1f-18188222cc2b` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-f15ab099-b6ea-44d1-982f-e102e7354a70` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-1502e490-6a81-46c6-b47a-207654b03aa1` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-8e0a3933-1ce5-40c8-8a7e-f2794e786fc6` |
| 5 | `POST /v1/auth/token` | 400 | 19 | `qa-4ab82723-e9d1-4e24-8432-d435ee1126c3` |
| 6 | `POST /v1/auth/token` | 200 | 84 | `qa-ab2df1ea-e199-4245-9884-6018d09e8ee5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-9ade778f-fd5a-46da-8f65-dd0c1cef7639` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-4fe405b7-f446-441a-9e42-4881dc9d1930` |
| 9 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-759ac53a-a38d-4193-b665-2f335476f5d7` |
| 10 | `POST /v1/auth/token` | 401 | 47 | `qa-1f57bd4c-d94d-4941-829a-26c0f56e606a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7226915b-87dd-411b-8d1f-18188222cc2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7226915b-87dd-411b-8d1f-18188222cc2b
Content-Type: application/json

--- request body ---
{"handle":"qa-a6e67a72bd1f","displayName":"QA a6e67a72bd1f","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7226915b-87dd-411b-8d1f-18188222cc2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-a6e67a72bd1f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae66764d-5695-407d-b3ee-012a7af48dce","handle":"qa-a6e67a72bd1f","displayName":"QA a6e67a72bd1f","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.522754484Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f15ab099-b6ea-44d1-982f-e102e7354a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f15ab099-b6ea-44d1-982f-e102e7354a70
Content-Type: application/json

--- request body ---
{"handle":"qa-9cb306c93f8a","displayName":"QA 9cb306c93f8a","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f15ab099-b6ea-44d1-982f-e102e7354a70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-9cb306c93f8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e16b6614-dbd2-49c8-96f5-5e29f1bfe23d","handle":"qa-9cb306c93f8a","displayName":"QA 9cb306c93f8a","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.583077845Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1502e490-6a81-46c6-b47a-207654b03aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1502e490-6a81-46c6-b47a-207654b03aa1
Content-Type: application/json

--- request body ---
{"handle":"qa-a6e67a72bd1f","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1502e490-6a81-46c6-b47a-207654b03aa1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae66764d-5695-407d-b3ee-012a7af48dce"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8e0a3933-1ce5-40c8-8a7e-f2794e786fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e0a3933-1ce5-40c8-8a7e-f2794e786fc6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9cb306c93f8a","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e0a3933-1ce5-40c8-8a7e-f2794e786fc6
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
Location: /v1/conversations/cnv_3cc49364-7941-4430-be59-fc3c81175787
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3cc49364-7941-4430-be59-fc3c81175787","subject":"Error contract","status":"open","region":"eu","participants":["qa-a6e67a72bd1f","qa-9cb306c93f8a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.695526067Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4ab82723-e9d1-4e24-8432-d435ee1126c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab82723-e9d1-4e24-8432-d435ee1126c3
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ab82723-e9d1-4e24-8432-d435ee1126c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-4ab82723-e9d1-4e24-8432-d435ee1126c3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ab2df1ea-e199-4245-9884-6018d09e8ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab2df1ea-e199-4245-9884-6018d09e8ee5
Content-Type: application/json

--- request body ---
{"handle":"qa-9cb306c93f8a","password":"****"}

--- response: 200 in 84 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab2df1ea-e199-4245-9884-6018d09e8ee5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e16b6614-dbd2-49c8-96f5-5e29f1bfe23d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ade778f-fd5a-46da-8f65-dd0c1cef7639

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ade778f-fd5a-46da-8f65-dd0c1cef7639
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ade778f-fd5a-46da-8f65-dd0c1cef7639
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
correlation: qa-4fe405b7-f446-441a-9e42-4881dc9d1930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fe405b7-f446-441a-9e42-4881dc9d1930
Content-Type: application/json

--- request body ---
{"handle":"qa-9cb306c93f8a","password":"****"}

--- response: 401 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fe405b7-f446-441a-9e42-4881dc9d1930
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4fe405b7-f446-441a-9e42-4881dc9d1930"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-759ac53a-a38d-4193-b665-2f335476f5d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-759ac53a-a38d-4193-b665-2f335476f5d7
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-759ac53a-a38d-4193-b665-2f335476f5d7
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
correlation: qa-1f57bd4c-d94d-4941-829a-26c0f56e606a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f57bd4c-d94d-4941-829a-26c0f56e606a
Content-Type: application/json

--- request body ---
{"handle":"qa-a6e67a72bd1f","password":"****"}

--- response: 401 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f57bd4c-d94d-4941-829a-26c0f56e606a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f57bd4c-d94d-4941-829a-26c0f56e606a"}
```
