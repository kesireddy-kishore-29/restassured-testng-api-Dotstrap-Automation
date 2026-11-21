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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-f6998ddb-ab9b-40ff-bbdb-b903e99a649e` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-0753d5e9-d809-48eb-8414-291ae6de7b0d` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-ecd5786a-d587-4414-9e42-9bb7a8e765dc` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-07aa667a-1431-4f60-b912-267408483fdf` |
| 5 | `POST /v1/auth/token` | 400 | 26 | `qa-269247c8-a0de-497b-afb9-079fdb5871f1` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-302ccc11-be6b-4ab3-baf1-82ae821c7df6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-4459ef10-d88c-4e7e-bbd7-4d5a863bab64` |
| 8 | `POST /v1/auth/token` | 401 | 41 | `qa-cb2c3fda-4d8b-43c2-8e6d-dddce25b7ed3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-03a47ccb-5e6e-4a5a-8ba7-a844e9242f36` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-6d3ebbf4-4208-42e3-a97c-b425b252cce6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6998ddb-ab9b-40ff-bbdb-b903e99a649e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6998ddb-ab9b-40ff-bbdb-b903e99a649e
Content-Type: application/json

--- request body ---
{"handle":"qa-f89d1a82a3f1","displayName":"QA f89d1a82a3f1","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6998ddb-ab9b-40ff-bbdb-b903e99a649e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-f89d1a82a3f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_502338fb-2fa5-453d-8c96-73d481ff5acd","handle":"qa-f89d1a82a3f1","displayName":"QA f89d1a82a3f1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.045434101Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0753d5e9-d809-48eb-8414-291ae6de7b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0753d5e9-d809-48eb-8414-291ae6de7b0d
Content-Type: application/json

--- request body ---
{"handle":"qa-d9626578dd12","displayName":"QA d9626578dd12","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0753d5e9-d809-48eb-8414-291ae6de7b0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-d9626578dd12
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a08a1433-4571-4ee0-b627-fdd2736dc110","handle":"qa-d9626578dd12","displayName":"QA d9626578dd12","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.078297851Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ecd5786a-d587-4414-9e42-9bb7a8e765dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd5786a-d587-4414-9e42-9bb7a8e765dc
Content-Type: application/json

--- request body ---
{"handle":"qa-f89d1a82a3f1","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecd5786a-d587-4414-9e42-9bb7a8e765dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_502338fb-2fa5-453d-8c96-73d481ff5acd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-07aa667a-1431-4f60-b912-267408483fdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07aa667a-1431-4f60-b912-267408483fdf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d9626578dd12","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-07aa667a-1431-4f60-b912-267408483fdf
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
Location: /v1/conversations/cnv_89a74d57-c191-40f4-bb8a-fa736dc592ce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_89a74d57-c191-40f4-bb8a-fa736dc592ce","subject":"Error contract","status":"open","region":"eu","participants":["qa-f89d1a82a3f1","qa-d9626578dd12"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.137477214Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-269247c8-a0de-497b-afb9-079fdb5871f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269247c8-a0de-497b-afb9-079fdb5871f1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-269247c8-a0de-497b-afb9-079fdb5871f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-269247c8-a0de-497b-afb9-079fdb5871f1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-302ccc11-be6b-4ab3-baf1-82ae821c7df6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302ccc11-be6b-4ab3-baf1-82ae821c7df6
Content-Type: application/json

--- request body ---
{"handle":"qa-d9626578dd12","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-302ccc11-be6b-4ab3-baf1-82ae821c7df6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a08a1433-4571-4ee0-b627-fdd2736dc110"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4459ef10-d88c-4e7e-bbd7-4d5a863bab64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4459ef10-d88c-4e7e-bbd7-4d5a863bab64
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4459ef10-d88c-4e7e-bbd7-4d5a863bab64
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
correlation: qa-cb2c3fda-4d8b-43c2-8e6d-dddce25b7ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2c3fda-4d8b-43c2-8e6d-dddce25b7ed3
Content-Type: application/json

--- request body ---
{"handle":"qa-d9626578dd12","password":"****"}

--- response: 401 in 41 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb2c3fda-4d8b-43c2-8e6d-dddce25b7ed3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb2c3fda-4d8b-43c2-8e6d-dddce25b7ed3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03a47ccb-5e6e-4a5a-8ba7-a844e9242f36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a47ccb-5e6e-4a5a-8ba7-a844e9242f36
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03a47ccb-5e6e-4a5a-8ba7-a844e9242f36
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
correlation: qa-6d3ebbf4-4208-42e3-a97c-b425b252cce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d3ebbf4-4208-42e3-a97c-b425b252cce6
Content-Type: application/json

--- request body ---
{"handle":"qa-f89d1a82a3f1","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d3ebbf4-4208-42e3-a97c-b425b252cce6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d3ebbf4-4208-42e3-a97c-b425b252cce6"}
```
