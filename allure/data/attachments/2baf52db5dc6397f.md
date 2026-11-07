# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-67c3c5c5-f2fe-4eb8-b7a4-5597bc8d8616` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-9c8b5e15-6254-4da9-97f4-ea92ca2972e7` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-172c5412-bf43-4964-829e-25d0c9c7ec11` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-a41501da-a6fe-4781-bc21-06950a9c2328` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 23 | `qa-2ac19451-9e9e-4599-8519-daad8ab90247` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-8d56d090-4021-4496-b998-94c7ade2d9ec` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-ef19537a-d374-46c4-b610-7b59acf135b0` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-a71c75f7-e3ca-4c39-903b-32f93dc201d3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c2a300fd-7f2d-44cb-8653-188779d70b0d` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-bcd93bb7-8a8f-47fa-99f7-d0186ca783a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-67c3c5c5-f2fe-4eb8-b7a4-5597bc8d8616

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67c3c5c5-f2fe-4eb8-b7a4-5597bc8d8616
Content-Type: application/json

--- request body ---
{"handle":"qa-7615cc5ce65f","displayName":"QA 7615cc5ce65f","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-67c3c5c5-f2fe-4eb8-b7a4-5597bc8d8616
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Location: /v1/accounts/qa-7615cc5ce65f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_beb7d8fe-fb0e-4a7e-8fd6-d061ce6cf305","handle":"qa-7615cc5ce65f","displayName":"QA 7615cc5ce65f","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.196213765Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9c8b5e15-6254-4da9-97f4-ea92ca2972e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c8b5e15-6254-4da9-97f4-ea92ca2972e7
Content-Type: application/json

--- request body ---
{"handle":"qa-12015deab0ac","displayName":"QA 12015deab0ac","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c8b5e15-6254-4da9-97f4-ea92ca2972e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-12015deab0ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8179fdb-8605-4903-bebb-b3daa2aa9e3b","handle":"qa-12015deab0ac","displayName":"QA 12015deab0ac","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.234311386Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-172c5412-bf43-4964-829e-25d0c9c7ec11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-172c5412-bf43-4964-829e-25d0c9c7ec11
Content-Type: application/json

--- request body ---
{"handle":"qa-7615cc5ce65f","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-172c5412-bf43-4964-829e-25d0c9c7ec11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_beb7d8fe-fb0e-4a7e-8fd6-d061ce6cf305"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a41501da-a6fe-4781-bc21-06950a9c2328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a41501da-a6fe-4781-bc21-06950a9c2328
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12015deab0ac","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a41501da-a6fe-4781-bc21-06950a9c2328
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
Location: /v1/conversations/cnv_f4e7c314-25f5-415b-b5dd-d31943c60e53
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f4e7c314-25f5-415b-b5dd-d31943c60e53","subject":"Error contract","status":"open","region":"eu","participants":["qa-7615cc5ce65f","qa-12015deab0ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.280935320Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f4e7c314-25f5-415b-b5dd-d31943c60e53/messages
correlation: qa-2ac19451-9e9e-4599-8519-daad8ab90247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac19451-9e9e-4599-8519-daad8ab90247
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ac19451-9e9e-4599-8519-daad8ab90247
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_f4e7c314-25f5-415b-b5dd-d31943c60e53/messages","correlationId":"qa-2ac19451-9e9e-4599-8519-daad8ab90247"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8d56d090-4021-4496-b998-94c7ade2d9ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d56d090-4021-4496-b998-94c7ade2d9ec
Content-Type: application/json

--- request body ---
{"handle":"qa-12015deab0ac","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d56d090-4021-4496-b998-94c7ade2d9ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8179fdb-8605-4903-bebb-b3daa2aa9e3b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef19537a-d374-46c4-b610-7b59acf135b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef19537a-d374-46c4-b610-7b59acf135b0
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef19537a-d374-46c4-b610-7b59acf135b0
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
correlation: qa-a71c75f7-e3ca-4c39-903b-32f93dc201d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a71c75f7-e3ca-4c39-903b-32f93dc201d3
Content-Type: application/json

--- request body ---
{"handle":"qa-12015deab0ac","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a71c75f7-e3ca-4c39-903b-32f93dc201d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a71c75f7-e3ca-4c39-903b-32f93dc201d3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2a300fd-7f2d-44cb-8653-188779d70b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2a300fd-7f2d-44cb-8653-188779d70b0d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2a300fd-7f2d-44cb-8653-188779d70b0d
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
correlation: qa-bcd93bb7-8a8f-47fa-99f7-d0186ca783a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd93bb7-8a8f-47fa-99f7-d0186ca783a1
Content-Type: application/json

--- request body ---
{"handle":"qa-7615cc5ce65f","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcd93bb7-8a8f-47fa-99f7-d0186ca783a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bcd93bb7-8a8f-47fa-99f7-d0186ca783a1"}
```
