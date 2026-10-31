# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-7c136a8e-5ea8-421a-b2bb-8a027f1d6f94` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-993bd8e4-8cf1-4e68-aba3-7580ffaf8378` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-ef737a34-f0c8-4135-b4ce-ec250d210433` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-8bf17313-885c-401f-a2cf-75b1b3cd3347` |
| 5 | `GET /v1/accounts/me` | 503 | 24 | `qa-201b486d-4c9b-4514-a7e2-93ee61e9defa` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-253b9101-6ce2-473f-9a8f-99d6c1395676` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-6acf63d8-02c5-47ea-80be-bfdc4a866339` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-84736b38-e8b3-4765-905e-ba6f636a2b33` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-54cf08c3-6be3-4813-b96e-009d354bbcf9` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-f7d6ade5-168e-4db9-bbb7-9d118d792193` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c136a8e-5ea8-421a-b2bb-8a027f1d6f94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c136a8e-5ea8-421a-b2bb-8a027f1d6f94
Content-Type: application/json

--- request body ---
{"handle":"qa-09878531bc37","displayName":"QA 09878531bc37","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c136a8e-5ea8-421a-b2bb-8a027f1d6f94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-09878531bc37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6e4e2cd-d9d3-4920-99f3-662e2ba0a6f0","handle":"qa-09878531bc37","displayName":"QA 09878531bc37","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.271946910Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-993bd8e4-8cf1-4e68-aba3-7580ffaf8378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-993bd8e4-8cf1-4e68-aba3-7580ffaf8378
Content-Type: application/json

--- request body ---
{"handle":"qa-249b4a3f5f2c","displayName":"QA 249b4a3f5f2c","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-993bd8e4-8cf1-4e68-aba3-7580ffaf8378
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-249b4a3f5f2c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55c137fa-45ac-4112-9ffa-a7cf15652346","handle":"qa-249b4a3f5f2c","displayName":"QA 249b4a3f5f2c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.313360353Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ef737a34-f0c8-4135-b4ce-ec250d210433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef737a34-f0c8-4135-b4ce-ec250d210433
Content-Type: application/json

--- request body ---
{"handle":"qa-09878531bc37","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef737a34-f0c8-4135-b4ce-ec250d210433
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6e4e2cd-d9d3-4920-99f3-662e2ba0a6f0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8bf17313-885c-401f-a2cf-75b1b3cd3347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf17313-885c-401f-a2cf-75b1b3cd3347
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-249b4a3f5f2c","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bf17313-885c-401f-a2cf-75b1b3cd3347
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
Location: /v1/conversations/cnv_840d1cf5-bf71-4ad0-8c72-5429445ed120
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_840d1cf5-bf71-4ad0-8c72-5429445ed120","subject":"Error contract","status":"open","region":"eu","participants":["qa-09878531bc37","qa-249b4a3f5f2c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.404893100Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-201b486d-4c9b-4514-a7e2-93ee61e9defa

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4d87a3c1-ef01-4b0d-a518-d15900d69f38
X-Correlation-Id: qa-201b486d-4c9b-4514-a7e2-93ee61e9defa
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-201b486d-4c9b-4514-a7e2-93ee61e9defa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-201b486d-4c9b-4514-a7e2-93ee61e9defa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-253b9101-6ce2-473f-9a8f-99d6c1395676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-253b9101-6ce2-473f-9a8f-99d6c1395676
Content-Type: application/json

--- request body ---
{"handle":"qa-249b4a3f5f2c","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-253b9101-6ce2-473f-9a8f-99d6c1395676
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55c137fa-45ac-4112-9ffa-a7cf15652346"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6acf63d8-02c5-47ea-80be-bfdc4a866339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acf63d8-02c5-47ea-80be-bfdc4a866339
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6acf63d8-02c5-47ea-80be-bfdc4a866339
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
correlation: qa-84736b38-e8b3-4765-905e-ba6f636a2b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84736b38-e8b3-4765-905e-ba6f636a2b33
Content-Type: application/json

--- request body ---
{"handle":"qa-249b4a3f5f2c","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84736b38-e8b3-4765-905e-ba6f636a2b33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84736b38-e8b3-4765-905e-ba6f636a2b33"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54cf08c3-6be3-4813-b96e-009d354bbcf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54cf08c3-6be3-4813-b96e-009d354bbcf9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54cf08c3-6be3-4813-b96e-009d354bbcf9
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
correlation: qa-f7d6ade5-168e-4db9-bbb7-9d118d792193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d6ade5-168e-4db9-bbb7-9d118d792193
Content-Type: application/json

--- request body ---
{"handle":"qa-09878531bc37","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7d6ade5-168e-4db9-bbb7-9d118d792193
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7d6ade5-168e-4db9-bbb7-9d118d792193"}
```
