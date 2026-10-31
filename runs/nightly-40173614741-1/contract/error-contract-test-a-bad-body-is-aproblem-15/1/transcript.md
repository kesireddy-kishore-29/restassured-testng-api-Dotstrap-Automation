# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-e693cf11-00c1-4074-ab16-0b8d84f97947` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-c4978639-fe5e-4507-8184-a89bc7df51b7` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-a2fb3150-5b51-4b86-9681-ff8b8b978925` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-18356557-33c6-4612-b788-ee982c1c68bb` |
| 5 | `POST /v1/credits/purchases` | 400 | 10 | `qa-69fa63a0-5de1-40e4-a120-eeb46cae1d17` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-cba037cf-ee00-46dc-8eb5-edc1f47bef62` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d5bd5f5b-428e-4a49-999a-ef6709eb3b9d` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-bef2b2aa-9c40-4cac-8b1e-b42f6a72683a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-196638bd-df7b-436a-90dd-c340997935a0` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-67404177-0361-4809-83f2-042007fdcf7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e693cf11-00c1-4074-ab16-0b8d84f97947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e693cf11-00c1-4074-ab16-0b8d84f97947
Content-Type: application/json

--- request body ---
{"handle":"qa-d9f8cadf05a9","displayName":"QA d9f8cadf05a9","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e693cf11-00c1-4074-ab16-0b8d84f97947
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Location: /v1/accounts/qa-d9f8cadf05a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b54d8de1-6e8b-4141-9ceb-2fa700eae6c3","handle":"qa-d9f8cadf05a9","displayName":"QA d9f8cadf05a9","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.734777480Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c4978639-fe5e-4507-8184-a89bc7df51b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4978639-fe5e-4507-8184-a89bc7df51b7
Content-Type: application/json

--- request body ---
{"handle":"qa-13b3df808e57","displayName":"QA 13b3df808e57","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4978639-fe5e-4507-8184-a89bc7df51b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Location: /v1/accounts/qa-13b3df808e57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ea13ad8-d407-42ee-882c-b29d15cc04fb","handle":"qa-13b3df808e57","displayName":"QA 13b3df808e57","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.780401450Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a2fb3150-5b51-4b86-9681-ff8b8b978925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2fb3150-5b51-4b86-9681-ff8b8b978925
Content-Type: application/json

--- request body ---
{"handle":"qa-d9f8cadf05a9","password":"****"}

--- response: 200 in 47 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2fb3150-5b51-4b86-9681-ff8b8b978925
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b54d8de1-6e8b-4141-9ceb-2fa700eae6c3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-18356557-33c6-4612-b788-ee982c1c68bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18356557-33c6-4612-b788-ee982c1c68bb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-13b3df808e57","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-18356557-33c6-4612-b788-ee982c1c68bb
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
Location: /v1/conversations/cnv_2876f6e5-181f-4859-b8ed-4760b6515fb7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2876f6e5-181f-4859-b8ed-4760b6515fb7","subject":"Error contract","status":"open","region":"eu","participants":["qa-d9f8cadf05a9","qa-13b3df808e57"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.874479962Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-69fa63a0-5de1-40e4-a120-eeb46cae1d17

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca5ab89119fa4f1390e3cbe9c8f1306c
X-Correlation-Id: qa-69fa63a0-5de1-40e4-a120-eeb46cae1d17
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69fa63a0-5de1-40e4-a120-eeb46cae1d17
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-69fa63a0-5de1-40e4-a120-eeb46cae1d17"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cba037cf-ee00-46dc-8eb5-edc1f47bef62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cba037cf-ee00-46dc-8eb5-edc1f47bef62
Content-Type: application/json

--- request body ---
{"handle":"qa-13b3df808e57","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cba037cf-ee00-46dc-8eb5-edc1f47bef62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ea13ad8-d407-42ee-882c-b29d15cc04fb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5bd5f5b-428e-4a49-999a-ef6709eb3b9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5bd5f5b-428e-4a49-999a-ef6709eb3b9d
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5bd5f5b-428e-4a49-999a-ef6709eb3b9d
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
correlation: qa-bef2b2aa-9c40-4cac-8b1e-b42f6a72683a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bef2b2aa-9c40-4cac-8b1e-b42f6a72683a
Content-Type: application/json

--- request body ---
{"handle":"qa-13b3df808e57","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bef2b2aa-9c40-4cac-8b1e-b42f6a72683a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bef2b2aa-9c40-4cac-8b1e-b42f6a72683a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-196638bd-df7b-436a-90dd-c340997935a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-196638bd-df7b-436a-90dd-c340997935a0
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-196638bd-df7b-436a-90dd-c340997935a0
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
correlation: qa-67404177-0361-4809-83f2-042007fdcf7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67404177-0361-4809-83f2-042007fdcf7f
Content-Type: application/json

--- request body ---
{"handle":"qa-d9f8cadf05a9","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67404177-0361-4809-83f2-042007fdcf7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67404177-0361-4809-83f2-042007fdcf7f"}
```
