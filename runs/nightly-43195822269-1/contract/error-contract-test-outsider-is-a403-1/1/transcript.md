# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-b3cc0fdd-bd24-4421-8948-9e6876ed8642` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-6873b781-8ed7-4c4e-9366-0eb83cd04679` |
| 3 | `POST /v1/accounts` | 201 | 43 | `qa-76b20ce5-49f6-40ec-ace0-81009ffe6a44` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-0e4f79aa-05a4-49ca-be24-a9fb06c089ea` |
| 5 | `POST /v1/conversations` | 201 | 3 | `qa-f0ad41fc-8d68-4c2d-8252-41bed32d142a` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-5be04c3b-b878-46eb-88d5-5f4f46ed2a5c` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-155b55fa-2165-4b81-a2d2-049559a31c41` |
| 8 | `DELETE /v1/accounts/me` | 204 | 69 | `qa-a1be3d17-5a68-4065-82b5-248753883762` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-7b073b2d-9857-48ea-bae3-d4d3b993bd89` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-5fc09d5e-e49f-409d-990a-a488aefd80da` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b85a6817-f46d-4231-afca-0140acf2f16c` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-d0686df3-5214-4af7-8245-80554258dda6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-70c2bbde-8751-4a65-a3b2-1acb690a3727` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-c1fe0388-1409-4287-a0d6-a38a3906eca5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3cc0fdd-bd24-4421-8948-9e6876ed8642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3cc0fdd-bd24-4421-8948-9e6876ed8642
Content-Type: application/json

--- request body ---
{"handle":"qa-c389ce8ee672","displayName":"QA c389ce8ee672","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3cc0fdd-bd24-4421-8948-9e6876ed8642
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-c389ce8ee672
X-Served-Region: eu
Content-Length: 181

{"id":"acc_907e9d01-40e5-4a57-9178-a301b349e313","handle":"qa-c389ce8ee672","displayName":"QA c389ce8ee672","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.067747021Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6873b781-8ed7-4c4e-9366-0eb83cd04679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6873b781-8ed7-4c4e-9366-0eb83cd04679
Content-Type: application/json

--- request body ---
{"handle":"qa-54f0e9be1f0c","displayName":"QA 54f0e9be1f0c","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6873b781-8ed7-4c4e-9366-0eb83cd04679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Location: /v1/accounts/qa-54f0e9be1f0c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dfb536c8-e089-4526-955c-120fedffb5e1","handle":"qa-54f0e9be1f0c","displayName":"QA 54f0e9be1f0c","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.108348662Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-76b20ce5-49f6-40ec-ace0-81009ffe6a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76b20ce5-49f6-40ec-ace0-81009ffe6a44
Content-Type: application/json

--- request body ---
{"handle":"qa-4ae6cf72880a","displayName":"QA 4ae6cf72880a","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-76b20ce5-49f6-40ec-ace0-81009ffe6a44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Location: /v1/accounts/qa-4ae6cf72880a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db34b7ae-b633-447a-81c4-cd61909c1c91","handle":"qa-4ae6cf72880a","displayName":"QA 4ae6cf72880a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.157522346Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0e4f79aa-05a4-49ca-be24-a9fb06c089ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e4f79aa-05a4-49ca-be24-a9fb06c089ea
Content-Type: application/json

--- request body ---
{"handle":"qa-c389ce8ee672","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e4f79aa-05a4-49ca-be24-a9fb06c089ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_907e9d01-40e5-4a57-9178-a301b349e313"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f0ad41fc-8d68-4c2d-8252-41bed32d142a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ad41fc-8d68-4c2d-8252-41bed32d142a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54f0e9be1f0c","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0ad41fc-8d68-4c2d-8252-41bed32d142a
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
Location: /v1/conversations/cnv_4b57a441-4ea8-4ad8-ac99-07fb5bb336f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b57a441-4ea8-4ad8-ac99-07fb5bb336f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-c389ce8ee672","qa-54f0e9be1f0c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.217951329Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5be04c3b-b878-46eb-88d5-5f4f46ed2a5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be04c3b-b878-46eb-88d5-5f4f46ed2a5c
Content-Type: application/json

--- request body ---
{"handle":"qa-4ae6cf72880a","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5be04c3b-b878-46eb-88d5-5f4f46ed2a5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db34b7ae-b633-447a-81c4-cd61909c1c91"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4b57a441-4ea8-4ad8-ac99-07fb5bb336f0/messages
correlation: qa-155b55fa-2165-4b81-a2d2-049559a31c41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-155b55fa-2165-4b81-a2d2-049559a31c41
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-155b55fa-2165-4b81-a2d2-049559a31c41
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4b57a441-4ea8-4ad8-ac99-07fb5bb336f0/messages","correlationId":"qa-155b55fa-2165-4b81-a2d2-049559a31c41"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1be3d17-5a68-4065-82b5-248753883762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1be3d17-5a68-4065-82b5-248753883762
Content-Type: application/json

--- response: 204 in 69 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1be3d17-5a68-4065-82b5-248753883762
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-7b073b2d-9857-48ea-bae3-d4d3b993bd89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b073b2d-9857-48ea-bae3-d4d3b993bd89
Content-Type: application/json

--- request body ---
{"handle":"qa-4ae6cf72880a","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b073b2d-9857-48ea-bae3-d4d3b993bd89
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b073b2d-9857-48ea-bae3-d4d3b993bd89"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5fc09d5e-e49f-409d-990a-a488aefd80da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc09d5e-e49f-409d-990a-a488aefd80da
Content-Type: application/json

--- request body ---
{"handle":"qa-54f0e9be1f0c","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fc09d5e-e49f-409d-990a-a488aefd80da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dfb536c8-e089-4526-955c-120fedffb5e1"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b85a6817-f46d-4231-afca-0140acf2f16c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b85a6817-f46d-4231-afca-0140acf2f16c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b85a6817-f46d-4231-afca-0140acf2f16c
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d0686df3-5214-4af7-8245-80554258dda6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0686df3-5214-4af7-8245-80554258dda6
Content-Type: application/json

--- request body ---
{"handle":"qa-54f0e9be1f0c","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0686df3-5214-4af7-8245-80554258dda6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0686df3-5214-4af7-8245-80554258dda6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70c2bbde-8751-4a65-a3b2-1acb690a3727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70c2bbde-8751-4a65-a3b2-1acb690a3727
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70c2bbde-8751-4a65-a3b2-1acb690a3727
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c1fe0388-1409-4287-a0d6-a38a3906eca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1fe0388-1409-4287-a0d6-a38a3906eca5
Content-Type: application/json

--- request body ---
{"handle":"qa-c389ce8ee672","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1fe0388-1409-4287-a0d6-a38a3906eca5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1fe0388-1409-4287-a0d6-a38a3906eca5"}
```
