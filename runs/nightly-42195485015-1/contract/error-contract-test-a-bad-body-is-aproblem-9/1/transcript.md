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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-33c8ed98-62ae-4b82-aff3-2f6ff9ad8dad` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-92ef5403-a7b8-4ad5-b6ee-05551c3c863c` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-31ab1755-9a69-4515-9667-8d8ea14dd39c` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-61c0ddc3-c3c5-47e0-a396-583d71724a6d` |
| 5 | `POST /v1/conversations` | 400 | 24 | `qa-c25d39f4-c01e-4958-88ab-68634f9f9dc6` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-23508ccb-0ee7-4e9e-ade9-106ea7935358` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-22b54822-5e01-48c4-b22d-fa9ce183978b` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-2c0057e7-d763-4033-b298-4bdbda9f3aee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-3066b5aa-736a-4e89-ad32-c16fbd3574c7` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-121ae487-c65b-412f-9941-4252217f3f74` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-33c8ed98-62ae-4b82-aff3-2f6ff9ad8dad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c8ed98-62ae-4b82-aff3-2f6ff9ad8dad
Content-Type: application/json

--- request body ---
{"handle":"qa-50afb564a3f6","displayName":"QA 50afb564a3f6","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-33c8ed98-62ae-4b82-aff3-2f6ff9ad8dad
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
Location: /v1/accounts/qa-50afb564a3f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_084d99c9-acb0-4b91-a246-e5552e58a853","handle":"qa-50afb564a3f6","displayName":"QA 50afb564a3f6","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.590328831Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92ef5403-a7b8-4ad5-b6ee-05551c3c863c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ef5403-a7b8-4ad5-b6ee-05551c3c863c
Content-Type: application/json

--- request body ---
{"handle":"qa-9573bafcfde1","displayName":"QA 9573bafcfde1","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-92ef5403-a7b8-4ad5-b6ee-05551c3c863c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-9573bafcfde1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_efe9f517-ed7f-4650-9e3f-1f56d732a054","handle":"qa-9573bafcfde1","displayName":"QA 9573bafcfde1","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.654436992Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31ab1755-9a69-4515-9667-8d8ea14dd39c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ab1755-9a69-4515-9667-8d8ea14dd39c
Content-Type: application/json

--- request body ---
{"handle":"qa-50afb564a3f6","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-31ab1755-9a69-4515-9667-8d8ea14dd39c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_084d99c9-acb0-4b91-a246-e5552e58a853"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-61c0ddc3-c3c5-47e0-a396-583d71724a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61c0ddc3-c3c5-47e0-a396-583d71724a6d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9573bafcfde1","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-61c0ddc3-c3c5-47e0-a396-583d71724a6d
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
Location: /v1/conversations/cnv_cae81704-b32f-4c59-9fed-9c103369fa11
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cae81704-b32f-4c59-9fed-9c103369fa11","subject":"Error contract","status":"open","region":"eu","participants":["qa-50afb564a3f6","qa-9573bafcfde1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.754112953Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c25d39f4-c01e-4958-88ab-68634f9f9dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c25d39f4-c01e-4958-88ab-68634f9f9dc6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c25d39f4-c01e-4958-88ab-68634f9f9dc6
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-c25d39f4-c01e-4958-88ab-68634f9f9dc6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-23508ccb-0ee7-4e9e-ade9-106ea7935358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23508ccb-0ee7-4e9e-ade9-106ea7935358
Content-Type: application/json

--- request body ---
{"handle":"qa-9573bafcfde1","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-23508ccb-0ee7-4e9e-ade9-106ea7935358
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_efe9f517-ed7f-4650-9e3f-1f56d732a054"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22b54822-5e01-48c4-b22d-fa9ce183978b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b54822-5e01-48c4-b22d-fa9ce183978b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22b54822-5e01-48c4-b22d-fa9ce183978b
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
correlation: qa-2c0057e7-d763-4033-b298-4bdbda9f3aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c0057e7-d763-4033-b298-4bdbda9f3aee
Content-Type: application/json

--- request body ---
{"handle":"qa-9573bafcfde1","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c0057e7-d763-4033-b298-4bdbda9f3aee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c0057e7-d763-4033-b298-4bdbda9f3aee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3066b5aa-736a-4e89-ad32-c16fbd3574c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3066b5aa-736a-4e89-ad32-c16fbd3574c7
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3066b5aa-736a-4e89-ad32-c16fbd3574c7
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
correlation: qa-121ae487-c65b-412f-9941-4252217f3f74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-121ae487-c65b-412f-9941-4252217f3f74
Content-Type: application/json

--- request body ---
{"handle":"qa-50afb564a3f6","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-121ae487-c65b-412f-9941-4252217f3f74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-121ae487-c65b-412f-9941-4252217f3f74"}
```
