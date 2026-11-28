# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-75c779cf-e72c-4cac-abb1-25262fe0190f` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-80134abf-eb98-400f-8012-725a3761e671` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-640bb5d9-2142-4de3-b21e-c544735b3eb8` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-1eceb416-fb21-47ca-be8c-42dae18b0f2f` |
| 5 | `POST /v1/conversations` | 415 | 17 | `qa-1d5c54ba-03d9-438c-bc86-ad39c5f81d53` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-9b901365-adf9-4a45-90bf-e751e7a68f88` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5f449df3-e413-4640-b628-4651db7eabf0` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-3805a26a-655a-4c22-848d-d8b9f8e0589a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1911dbb2-d27a-47c3-afb7-8e0b3366a53a` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-2f189f44-72ad-41ab-8a98-2428fdb9a450` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75c779cf-e72c-4cac-abb1-25262fe0190f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c779cf-e72c-4cac-abb1-25262fe0190f
Content-Type: application/json

--- request body ---
{"handle":"qa-2cc258ca3091","displayName":"QA 2cc258ca3091","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-75c779cf-e72c-4cac-abb1-25262fe0190f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-2cc258ca3091
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f94fa0c1-3da7-47b2-ae8b-64d3ccecaeb8","handle":"qa-2cc258ca3091","displayName":"QA 2cc258ca3091","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.757074693Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-80134abf-eb98-400f-8012-725a3761e671

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80134abf-eb98-400f-8012-725a3761e671
Content-Type: application/json

--- request body ---
{"handle":"qa-d20f0b286364","displayName":"QA d20f0b286364","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-80134abf-eb98-400f-8012-725a3761e671
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-d20f0b286364
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d61ab6c7-9b7c-420f-8a96-580f19ed02b2","handle":"qa-d20f0b286364","displayName":"QA d20f0b286364","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.782800083Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-640bb5d9-2142-4de3-b21e-c544735b3eb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-640bb5d9-2142-4de3-b21e-c544735b3eb8
Content-Type: application/json

--- request body ---
{"handle":"qa-2cc258ca3091","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-640bb5d9-2142-4de3-b21e-c544735b3eb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f94fa0c1-3da7-47b2-ae8b-64d3ccecaeb8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1eceb416-fb21-47ca-be8c-42dae18b0f2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eceb416-fb21-47ca-be8c-42dae18b0f2f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d20f0b286364","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eceb416-fb21-47ca-be8c-42dae18b0f2f
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
Location: /v1/conversations/cnv_b91d1a37-5696-42aa-b38c-a91c9fc08078
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b91d1a37-5696-42aa-b38c-a91c9fc08078","subject":"Error contract","status":"open","region":"eu","participants":["qa-2cc258ca3091","qa-d20f0b286364"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.843062604Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1d5c54ba-03d9-438c-bc86-ad39c5f81d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d5c54ba-03d9-438c-bc86-ad39c5f81d53
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d5c54ba-03d9-438c-bc86-ad39c5f81d53
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-1d5c54ba-03d9-438c-bc86-ad39c5f81d53"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9b901365-adf9-4a45-90bf-e751e7a68f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b901365-adf9-4a45-90bf-e751e7a68f88
Content-Type: application/json

--- request body ---
{"handle":"qa-d20f0b286364","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b901365-adf9-4a45-90bf-e751e7a68f88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d61ab6c7-9b7c-420f-8a96-580f19ed02b2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f449df3-e413-4640-b628-4651db7eabf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f449df3-e413-4640-b628-4651db7eabf0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f449df3-e413-4640-b628-4651db7eabf0
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
correlation: qa-3805a26a-655a-4c22-848d-d8b9f8e0589a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3805a26a-655a-4c22-848d-d8b9f8e0589a
Content-Type: application/json

--- request body ---
{"handle":"qa-d20f0b286364","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3805a26a-655a-4c22-848d-d8b9f8e0589a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3805a26a-655a-4c22-848d-d8b9f8e0589a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1911dbb2-d27a-47c3-afb7-8e0b3366a53a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1911dbb2-d27a-47c3-afb7-8e0b3366a53a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1911dbb2-d27a-47c3-afb7-8e0b3366a53a
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
correlation: qa-2f189f44-72ad-41ab-8a98-2428fdb9a450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f189f44-72ad-41ab-8a98-2428fdb9a450
Content-Type: application/json

--- request body ---
{"handle":"qa-2cc258ca3091","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f189f44-72ad-41ab-8a98-2428fdb9a450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f189f44-72ad-41ab-8a98-2428fdb9a450"}
```
