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
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-c1dec9d2-dd79-48e8-ba31-7afbe336141a` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-ce13e3eb-2167-409b-a11c-b937c817e002` |
| 3 | `POST /v1/auth/token` | 200 | 71 | `qa-e3f382ad-911c-4ac3-93f7-893e0f7c55f5` |
| 4 | `POST /v1/conversations` | 201 | 66 | `qa-f7617dd1-73a7-4fd9-8629-5d7796555b03` |
| 5 | `POST /v1/accounts` | 415 | 20 | `qa-eb331347-7bab-4107-aec1-c6b4c146b5aa` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-e5aefa4d-1834-491f-8893-20257bf3f68e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-dea3c11b-3afb-4d3d-a627-e1a47603c583` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-c3098b7e-d4ad-43fc-ac3e-f61584aa33b3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-f607d290-6fe1-4ade-8ddf-6ffa6a86aeca` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-1d27a99f-811b-433a-8185-9f1e8e9355a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1dec9d2-dd79-48e8-ba31-7afbe336141a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1dec9d2-dd79-48e8-ba31-7afbe336141a
Content-Type: application/json

--- request body ---
{"handle":"qa-8be470390211","displayName":"QA 8be470390211","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1dec9d2-dd79-48e8-ba31-7afbe336141a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Location: /v1/accounts/qa-8be470390211
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7596f545-ec7c-4746-9e6a-0e3caed03056","handle":"qa-8be470390211","displayName":"QA 8be470390211","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.313495179Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ce13e3eb-2167-409b-a11c-b937c817e002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce13e3eb-2167-409b-a11c-b937c817e002
Content-Type: application/json

--- request body ---
{"handle":"qa-4330e879e079","displayName":"QA 4330e879e079","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce13e3eb-2167-409b-a11c-b937c817e002
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Location: /v1/accounts/qa-4330e879e079
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c33b7818-efa4-4759-bbb6-a7b3fb952c17","handle":"qa-4330e879e079","displayName":"QA 4330e879e079","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.339832878Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3f382ad-911c-4ac3-93f7-893e0f7c55f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f382ad-911c-4ac3-93f7-893e0f7c55f5
Content-Type: application/json

--- request body ---
{"handle":"qa-8be470390211","password":"****"}

--- response: 200 in 71 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3f382ad-911c-4ac3-93f7-893e0f7c55f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7596f545-ec7c-4746-9e6a-0e3caed03056"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f7617dd1-73a7-4fd9-8629-5d7796555b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7617dd1-73a7-4fd9-8629-5d7796555b03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4330e879e079","subject":"Error contract","message":"Hi"}

--- response: 201 in 66 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7617dd1-73a7-4fd9-8629-5d7796555b03
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
Location: /v1/conversations/cnv_97e9b80b-0f94-44a7-9941-6ee1b16812f6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_97e9b80b-0f94-44a7-9941-6ee1b16812f6","subject":"Error contract","status":"open","region":"eu","participants":["qa-8be470390211","qa-4330e879e079"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.508988272Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-eb331347-7bab-4107-aec1-c6b4c146b5aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb331347-7bab-4107-aec1-c6b4c146b5aa
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb331347-7bab-4107-aec1-c6b4c146b5aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-eb331347-7bab-4107-aec1-c6b4c146b5aa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e5aefa4d-1834-491f-8893-20257bf3f68e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5aefa4d-1834-491f-8893-20257bf3f68e
Content-Type: application/json

--- request body ---
{"handle":"qa-4330e879e079","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5aefa4d-1834-491f-8893-20257bf3f68e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c33b7818-efa4-4759-bbb6-a7b3fb952c17"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dea3c11b-3afb-4d3d-a627-e1a47603c583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea3c11b-3afb-4d3d-a627-e1a47603c583
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dea3c11b-3afb-4d3d-a627-e1a47603c583
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
correlation: qa-c3098b7e-d4ad-43fc-ac3e-f61584aa33b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3098b7e-d4ad-43fc-ac3e-f61584aa33b3
Content-Type: application/json

--- request body ---
{"handle":"qa-4330e879e079","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3098b7e-d4ad-43fc-ac3e-f61584aa33b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3098b7e-d4ad-43fc-ac3e-f61584aa33b3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f607d290-6fe1-4ade-8ddf-6ffa6a86aeca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f607d290-6fe1-4ade-8ddf-6ffa6a86aeca
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f607d290-6fe1-4ade-8ddf-6ffa6a86aeca
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
correlation: qa-1d27a99f-811b-433a-8185-9f1e8e9355a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d27a99f-811b-433a-8185-9f1e8e9355a0
Content-Type: application/json

--- request body ---
{"handle":"qa-8be470390211","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d27a99f-811b-433a-8185-9f1e8e9355a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d27a99f-811b-433a-8185-9f1e8e9355a0"}
```
