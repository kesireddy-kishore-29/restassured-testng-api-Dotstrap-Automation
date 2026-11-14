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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-288cf575-c81f-4cb2-93c4-2978318e87ed` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-51f3490d-9988-4eb4-b2b5-851f46499b16` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-6f90f24d-2703-4529-8f46-d4596cba393d` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-aa3e3953-ff43-45a2-a0ce-de190e6905b9` |
| 5 | `POST /v1/accounts` | 415 | 17 | `qa-384430f5-ed3f-4df1-8fdb-54c4a080492a` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-4b9ce63e-0dcc-4615-964c-7e8c71a63d88` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-dbc4982a-852a-43da-9d05-f0dd3b4546ba` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-41f4bcf9-350e-4144-a3fa-c4d2a1eed162` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-37247cd4-6497-4439-97eb-d4b96d876fba` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-686f251a-5a17-4264-a2bf-c3e5b232d8ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-288cf575-c81f-4cb2-93c4-2978318e87ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-288cf575-c81f-4cb2-93c4-2978318e87ed
Content-Type: application/json

--- request body ---
{"handle":"qa-34fee6aaa12b","displayName":"QA 34fee6aaa12b","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-288cf575-c81f-4cb2-93c4-2978318e87ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Location: /v1/accounts/qa-34fee6aaa12b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab36e15f-4bce-4fdf-a8bc-3166b47ed25a","handle":"qa-34fee6aaa12b","displayName":"QA 34fee6aaa12b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.627061026Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51f3490d-9988-4eb4-b2b5-851f46499b16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51f3490d-9988-4eb4-b2b5-851f46499b16
Content-Type: application/json

--- request body ---
{"handle":"qa-ee217eeae97b","displayName":"QA ee217eeae97b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-51f3490d-9988-4eb4-b2b5-851f46499b16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Location: /v1/accounts/qa-ee217eeae97b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_71176d21-d8c2-41eb-8ab6-f6fc0f701a67","handle":"qa-ee217eeae97b","displayName":"QA ee217eeae97b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.662559860Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6f90f24d-2703-4529-8f46-d4596cba393d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f90f24d-2703-4529-8f46-d4596cba393d
Content-Type: application/json

--- request body ---
{"handle":"qa-34fee6aaa12b","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f90f24d-2703-4529-8f46-d4596cba393d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab36e15f-4bce-4fdf-a8bc-3166b47ed25a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aa3e3953-ff43-45a2-a0ce-de190e6905b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa3e3953-ff43-45a2-a0ce-de190e6905b9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ee217eeae97b","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa3e3953-ff43-45a2-a0ce-de190e6905b9
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
Location: /v1/conversations/cnv_fb5ce8ff-69d5-40d9-bf13-2d3f033d4bc5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fb5ce8ff-69d5-40d9-bf13-2d3f033d4bc5","subject":"Error contract","status":"open","region":"eu","participants":["qa-34fee6aaa12b","qa-ee217eeae97b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.719133136Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-384430f5-ed3f-4df1-8fdb-54c4a080492a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-384430f5-ed3f-4df1-8fdb-54c4a080492a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-384430f5-ed3f-4df1-8fdb-54c4a080492a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-384430f5-ed3f-4df1-8fdb-54c4a080492a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4b9ce63e-0dcc-4615-964c-7e8c71a63d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b9ce63e-0dcc-4615-964c-7e8c71a63d88
Content-Type: application/json

--- request body ---
{"handle":"qa-ee217eeae97b","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b9ce63e-0dcc-4615-964c-7e8c71a63d88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71176d21-d8c2-41eb-8ab6-f6fc0f701a67"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbc4982a-852a-43da-9d05-f0dd3b4546ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbc4982a-852a-43da-9d05-f0dd3b4546ba
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbc4982a-852a-43da-9d05-f0dd3b4546ba
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
correlation: qa-41f4bcf9-350e-4144-a3fa-c4d2a1eed162

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41f4bcf9-350e-4144-a3fa-c4d2a1eed162
Content-Type: application/json

--- request body ---
{"handle":"qa-ee217eeae97b","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41f4bcf9-350e-4144-a3fa-c4d2a1eed162
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-41f4bcf9-350e-4144-a3fa-c4d2a1eed162"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37247cd4-6497-4439-97eb-d4b96d876fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37247cd4-6497-4439-97eb-d4b96d876fba
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37247cd4-6497-4439-97eb-d4b96d876fba
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
correlation: qa-686f251a-5a17-4264-a2bf-c3e5b232d8ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-686f251a-5a17-4264-a2bf-c3e5b232d8ad
Content-Type: application/json

--- request body ---
{"handle":"qa-34fee6aaa12b","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-686f251a-5a17-4264-a2bf-c3e5b232d8ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-686f251a-5a17-4264-a2bf-c3e5b232d8ad"}
```
