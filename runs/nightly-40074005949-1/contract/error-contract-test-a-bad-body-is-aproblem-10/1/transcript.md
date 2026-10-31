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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-0c2d4071-6c7a-47e6-a9bc-c5b3c229dbdf` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-33df1982-eb12-4dce-ada2-8ee5b17e13ef` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-07eed037-1580-4e34-ab53-983b3ca3734b` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-23a6741d-08cc-4f40-9312-d650186a11b4` |
| 5 | `POST /v1/conversations` | 415 | 10 | `qa-7b7e9b88-db7b-44b9-8f6d-32f770a72f0f` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-df552632-09c9-48d5-96ec-5171be2ffaeb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-beeee6ce-aa16-4522-926f-7a0b20dd1e0c` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-1f09ebb9-253c-44f3-9cf5-e87f1b6fd631` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e78525bf-022d-462d-83f1-9feec7026eb2` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-a8be51ef-2dfd-40ad-a055-9a5aca3515bc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0c2d4071-6c7a-47e6-a9bc-c5b3c229dbdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c2d4071-6c7a-47e6-a9bc-c5b3c229dbdf
Content-Type: application/json

--- request body ---
{"handle":"qa-baa9ec1c1916","displayName":"QA baa9ec1c1916","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c2d4071-6c7a-47e6-a9bc-c5b3c229dbdf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-baa9ec1c1916
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e756ab9-1ee5-4c3e-8df2-121688c9db84","handle":"qa-baa9ec1c1916","displayName":"QA baa9ec1c1916","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.330996397Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33df1982-eb12-4dce-ada2-8ee5b17e13ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33df1982-eb12-4dce-ada2-8ee5b17e13ef
Content-Type: application/json

--- request body ---
{"handle":"qa-e22b23a0de6d","displayName":"QA e22b23a0de6d","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-33df1982-eb12-4dce-ada2-8ee5b17e13ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-e22b23a0de6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29610cdb-6ca8-4998-8915-4906d861826c","handle":"qa-e22b23a0de6d","displayName":"QA e22b23a0de6d","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.379453362Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-07eed037-1580-4e34-ab53-983b3ca3734b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07eed037-1580-4e34-ab53-983b3ca3734b
Content-Type: application/json

--- request body ---
{"handle":"qa-baa9ec1c1916","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-07eed037-1580-4e34-ab53-983b3ca3734b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e756ab9-1ee5-4c3e-8df2-121688c9db84"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-23a6741d-08cc-4f40-9312-d650186a11b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a6741d-08cc-4f40-9312-d650186a11b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e22b23a0de6d","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-23a6741d-08cc-4f40-9312-d650186a11b4
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
Location: /v1/conversations/cnv_fb4709c6-931d-4cb9-99c7-7dbcb1216d25
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fb4709c6-931d-4cb9-99c7-7dbcb1216d25","subject":"Error contract","status":"open","region":"eu","participants":["qa-baa9ec1c1916","qa-e22b23a0de6d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.419915041Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7b7e9b88-db7b-44b9-8f6d-32f770a72f0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7e9b88-db7b-44b9-8f6d-32f770a72f0f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b7e9b88-db7b-44b9-8f6d-32f770a72f0f
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-7b7e9b88-db7b-44b9-8f6d-32f770a72f0f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-df552632-09c9-48d5-96ec-5171be2ffaeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df552632-09c9-48d5-96ec-5171be2ffaeb
Content-Type: application/json

--- request body ---
{"handle":"qa-e22b23a0de6d","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-df552632-09c9-48d5-96ec-5171be2ffaeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29610cdb-6ca8-4998-8915-4906d861826c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-beeee6ce-aa16-4522-926f-7a0b20dd1e0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beeee6ce-aa16-4522-926f-7a0b20dd1e0c
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-beeee6ce-aa16-4522-926f-7a0b20dd1e0c
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
correlation: qa-1f09ebb9-253c-44f3-9cf5-e87f1b6fd631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f09ebb9-253c-44f3-9cf5-e87f1b6fd631
Content-Type: application/json

--- request body ---
{"handle":"qa-e22b23a0de6d","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f09ebb9-253c-44f3-9cf5-e87f1b6fd631
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f09ebb9-253c-44f3-9cf5-e87f1b6fd631"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e78525bf-022d-462d-83f1-9feec7026eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78525bf-022d-462d-83f1-9feec7026eb2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e78525bf-022d-462d-83f1-9feec7026eb2
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
correlation: qa-a8be51ef-2dfd-40ad-a055-9a5aca3515bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8be51ef-2dfd-40ad-a055-9a5aca3515bc
Content-Type: application/json

--- request body ---
{"handle":"qa-baa9ec1c1916","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8be51ef-2dfd-40ad-a055-9a5aca3515bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8be51ef-2dfd-40ad-a055-9a5aca3515bc"}
```
