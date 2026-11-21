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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-0381b5f6-5ab7-43ed-886d-5f392437f674` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-b79962e9-52f0-429a-acef-1ec857b5a477` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-68005cd7-8d5c-457a-a18a-5f9823bf2a40` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-73aee812-8459-48ad-8f08-c2198277d4bf` |
| 5 | `POST /v1/conversations` | 400 | 33 | `qa-e17989ad-44f8-42d7-88f3-e1f08106656e` |
| 6 | `POST /v1/auth/token` | 200 | 73 | `qa-429cdc4e-8679-4c21-a07d-28dbbc21f359` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-36ae6554-5a62-4304-ba47-5a4ec0bb1bd9` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-8ac4e28c-ce95-4374-9060-bc696a76d67b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-f754e17d-9bd7-4410-9823-98e319917790` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-9171f5eb-6db5-4306-818f-13ab419a9da1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0381b5f6-5ab7-43ed-886d-5f392437f674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0381b5f6-5ab7-43ed-886d-5f392437f674
Content-Type: application/json

--- request body ---
{"handle":"qa-3d54830ce3c4","displayName":"QA 3d54830ce3c4","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0381b5f6-5ab7-43ed-886d-5f392437f674
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
Location: /v1/accounts/qa-3d54830ce3c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bad65f1-526a-4e9a-a996-d3ab621edf4c","handle":"qa-3d54830ce3c4","displayName":"QA 3d54830ce3c4","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.976225287Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b79962e9-52f0-429a-acef-1ec857b5a477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b79962e9-52f0-429a-acef-1ec857b5a477
Content-Type: application/json

--- request body ---
{"handle":"qa-a428202beed4","displayName":"QA a428202beed4","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b79962e9-52f0-429a-acef-1ec857b5a477
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-a428202beed4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b48ebc30-969f-4010-8382-c391c7c14504","handle":"qa-a428202beed4","displayName":"QA a428202beed4","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.063962604Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-68005cd7-8d5c-457a-a18a-5f9823bf2a40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68005cd7-8d5c-457a-a18a-5f9823bf2a40
Content-Type: application/json

--- request body ---
{"handle":"qa-3d54830ce3c4","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-68005cd7-8d5c-457a-a18a-5f9823bf2a40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bad65f1-526a-4e9a-a996-d3ab621edf4c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-73aee812-8459-48ad-8f08-c2198277d4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73aee812-8459-48ad-8f08-c2198277d4bf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a428202beed4","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-73aee812-8459-48ad-8f08-c2198277d4bf
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
Location: /v1/conversations/cnv_2a8777fc-9be4-42b3-ad2b-daa6ff4353fa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a8777fc-9be4-42b3-ad2b-daa6ff4353fa","subject":"Error contract","status":"open","region":"eu","participants":["qa-3d54830ce3c4","qa-a428202beed4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.180822684Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e17989ad-44f8-42d7-88f3-e1f08106656e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e17989ad-44f8-42d7-88f3-e1f08106656e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e17989ad-44f8-42d7-88f3-e1f08106656e
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-e17989ad-44f8-42d7-88f3-e1f08106656e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-429cdc4e-8679-4c21-a07d-28dbbc21f359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-429cdc4e-8679-4c21-a07d-28dbbc21f359
Content-Type: application/json

--- request body ---
{"handle":"qa-a428202beed4","password":"****"}

--- response: 200 in 73 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-429cdc4e-8679-4c21-a07d-28dbbc21f359
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b48ebc30-969f-4010-8382-c391c7c14504"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36ae6554-5a62-4304-ba47-5a4ec0bb1bd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36ae6554-5a62-4304-ba47-5a4ec0bb1bd9
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36ae6554-5a62-4304-ba47-5a4ec0bb1bd9
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
correlation: qa-8ac4e28c-ce95-4374-9060-bc696a76d67b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ac4e28c-ce95-4374-9060-bc696a76d67b
Content-Type: application/json

--- request body ---
{"handle":"qa-a428202beed4","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ac4e28c-ce95-4374-9060-bc696a76d67b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ac4e28c-ce95-4374-9060-bc696a76d67b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f754e17d-9bd7-4410-9823-98e319917790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f754e17d-9bd7-4410-9823-98e319917790
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f754e17d-9bd7-4410-9823-98e319917790
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
correlation: qa-9171f5eb-6db5-4306-818f-13ab419a9da1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9171f5eb-6db5-4306-818f-13ab419a9da1
Content-Type: application/json

--- request body ---
{"handle":"qa-3d54830ce3c4","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9171f5eb-6db5-4306-818f-13ab419a9da1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9171f5eb-6db5-4306-818f-13ab419a9da1"}
```
