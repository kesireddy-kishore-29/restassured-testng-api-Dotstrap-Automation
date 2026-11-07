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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-0c132b51-8180-4887-99ba-d2106b1e13a6` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-4aca2571-4e4e-4d4c-87dc-07121d801798` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-a6b889f5-d586-4680-ac6a-d8f323446859` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-7d154e69-7f87-49ea-b921-dfd5eb60d6df` |
| 5 | `POST /v1/conversations` | 400 | 12 | `qa-ffe32348-9595-4f4a-8e94-ddf02c8fe13e` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-fcce2afc-432c-4b21-a07e-92d8084343c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-17a53e22-8943-4a30-82b0-15b5d0a2492b` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-6ffbd0b5-d99c-4fca-9fe5-f982e7d9ce1f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-6d5ef42c-ba2b-4597-a27b-6c924d96ee14` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-313f90ff-752a-468f-9394-5260f80e22a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0c132b51-8180-4887-99ba-d2106b1e13a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c132b51-8180-4887-99ba-d2106b1e13a6
Content-Type: application/json

--- request body ---
{"handle":"qa-9f884a25244a","displayName":"QA 9f884a25244a","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c132b51-8180-4887-99ba-d2106b1e13a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 9
Location: /v1/accounts/qa-9f884a25244a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00ee2748-75ce-428a-a3ef-67baf7559779","handle":"qa-9f884a25244a","displayName":"QA 9f884a25244a","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.738923924Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4aca2571-4e4e-4d4c-87dc-07121d801798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aca2571-4e4e-4d4c-87dc-07121d801798
Content-Type: application/json

--- request body ---
{"handle":"qa-5295256d4ff9","displayName":"QA 5295256d4ff9","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aca2571-4e4e-4d4c-87dc-07121d801798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 9
Location: /v1/accounts/qa-5295256d4ff9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f38a83b3-3bcf-4609-a3a0-f6ad0cac57d8","handle":"qa-5295256d4ff9","displayName":"QA 5295256d4ff9","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.777264849Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a6b889f5-d586-4680-ac6a-d8f323446859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6b889f5-d586-4680-ac6a-d8f323446859
Content-Type: application/json

--- request body ---
{"handle":"qa-9f884a25244a","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6b889f5-d586-4680-ac6a-d8f323446859
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00ee2748-75ce-428a-a3ef-67baf7559779"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7d154e69-7f87-49ea-b921-dfd5eb60d6df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d154e69-7f87-49ea-b921-dfd5eb60d6df
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5295256d4ff9","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d154e69-7f87-49ea-b921-dfd5eb60d6df
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
Location: /v1/conversations/cnv_260fa743-3c16-4d27-8fe0-0f8efcdb6729
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_260fa743-3c16-4d27-8fe0-0f8efcdb6729","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f884a25244a","qa-5295256d4ff9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.816637753Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ffe32348-9595-4f4a-8e94-ddf02c8fe13e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe32348-9595-4f4a-8e94-ddf02c8fe13e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffe32348-9595-4f4a-8e94-ddf02c8fe13e
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-ffe32348-9595-4f4a-8e94-ddf02c8fe13e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fcce2afc-432c-4b21-a07e-92d8084343c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcce2afc-432c-4b21-a07e-92d8084343c1
Content-Type: application/json

--- request body ---
{"handle":"qa-5295256d4ff9","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcce2afc-432c-4b21-a07e-92d8084343c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f38a83b3-3bcf-4609-a3a0-f6ad0cac57d8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17a53e22-8943-4a30-82b0-15b5d0a2492b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a53e22-8943-4a30-82b0-15b5d0a2492b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17a53e22-8943-4a30-82b0-15b5d0a2492b
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
correlation: qa-6ffbd0b5-d99c-4fca-9fe5-f982e7d9ce1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ffbd0b5-d99c-4fca-9fe5-f982e7d9ce1f
Content-Type: application/json

--- request body ---
{"handle":"qa-5295256d4ff9","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ffbd0b5-d99c-4fca-9fe5-f982e7d9ce1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ffbd0b5-d99c-4fca-9fe5-f982e7d9ce1f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d5ef42c-ba2b-4597-a27b-6c924d96ee14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d5ef42c-ba2b-4597-a27b-6c924d96ee14
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d5ef42c-ba2b-4597-a27b-6c924d96ee14
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
correlation: qa-313f90ff-752a-468f-9394-5260f80e22a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-313f90ff-752a-468f-9394-5260f80e22a8
Content-Type: application/json

--- request body ---
{"handle":"qa-9f884a25244a","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-313f90ff-752a-468f-9394-5260f80e22a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-313f90ff-752a-468f-9394-5260f80e22a8"}
```
