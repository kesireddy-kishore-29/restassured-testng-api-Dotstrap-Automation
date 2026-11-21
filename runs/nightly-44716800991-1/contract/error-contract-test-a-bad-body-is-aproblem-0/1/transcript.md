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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-438f3a21-4117-41d1-9ed7-401ec8d48cb1` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-07760e9a-b44f-4f24-8c81-3d894009b35b` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-c16bfdaa-0ba1-449c-931d-d22986b37eaa` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-626b23eb-0bf9-4416-a0d0-cc5dac92d474` |
| 5 | `POST /v1/auth/token` | 400 | 31 | `qa-9eb998f3-d224-4ca1-9275-65c3efb110cc` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-3ebfa506-3ab6-4a71-957c-54e8a41e8432` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-8645db38-9fe9-4333-a9fa-9a7f0271dfe9` |
| 8 | `POST /v1/auth/token` | 401 | 47 | `qa-cb87af62-d1bc-41ed-ab1c-77b3dd1a3a25` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-4cae53c2-2f15-44b2-bf12-9a4d8574898c` |
| 10 | `POST /v1/auth/token` | 401 | 78 | `qa-babbefa7-7758-4d8f-b911-cd163b2c5c0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-438f3a21-4117-41d1-9ed7-401ec8d48cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438f3a21-4117-41d1-9ed7-401ec8d48cb1
Content-Type: application/json

--- request body ---
{"handle":"qa-212eadf42aa8","displayName":"QA 212eadf42aa8","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-438f3a21-4117-41d1-9ed7-401ec8d48cb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-212eadf42aa8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d400320e-1f0e-4e59-840f-92afd0bf0210","handle":"qa-212eadf42aa8","displayName":"QA 212eadf42aa8","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.412949830Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07760e9a-b44f-4f24-8c81-3d894009b35b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07760e9a-b44f-4f24-8c81-3d894009b35b
Content-Type: application/json

--- request body ---
{"handle":"qa-ac5b95593a73","displayName":"QA ac5b95593a73","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-07760e9a-b44f-4f24-8c81-3d894009b35b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-ac5b95593a73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d4f5ca7-378d-420d-bc99-52861c42db3a","handle":"qa-ac5b95593a73","displayName":"QA ac5b95593a73","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.503534207Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c16bfdaa-0ba1-449c-931d-d22986b37eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16bfdaa-0ba1-449c-931d-d22986b37eaa
Content-Type: application/json

--- request body ---
{"handle":"qa-212eadf42aa8","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c16bfdaa-0ba1-449c-931d-d22986b37eaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d400320e-1f0e-4e59-840f-92afd0bf0210"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-626b23eb-0bf9-4416-a0d0-cc5dac92d474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-626b23eb-0bf9-4416-a0d0-cc5dac92d474
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ac5b95593a73","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-626b23eb-0bf9-4416-a0d0-cc5dac92d474
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
Location: /v1/conversations/cnv_e551f16c-35b2-4be4-a702-a8408869e369
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e551f16c-35b2-4be4-a702-a8408869e369","subject":"Error contract","status":"open","region":"eu","participants":["qa-212eadf42aa8","qa-ac5b95593a73"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.604200975Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9eb998f3-d224-4ca1-9275-65c3efb110cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eb998f3-d224-4ca1-9275-65c3efb110cc
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9eb998f3-d224-4ca1-9275-65c3efb110cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-9eb998f3-d224-4ca1-9275-65c3efb110cc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3ebfa506-3ab6-4a71-957c-54e8a41e8432

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ebfa506-3ab6-4a71-957c-54e8a41e8432
Content-Type: application/json

--- request body ---
{"handle":"qa-ac5b95593a73","password":"****"}

--- response: 200 in 59 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ebfa506-3ab6-4a71-957c-54e8a41e8432
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d4f5ca7-378d-420d-bc99-52861c42db3a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8645db38-9fe9-4333-a9fa-9a7f0271dfe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8645db38-9fe9-4333-a9fa-9a7f0271dfe9
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8645db38-9fe9-4333-a9fa-9a7f0271dfe9
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
correlation: qa-cb87af62-d1bc-41ed-ab1c-77b3dd1a3a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb87af62-d1bc-41ed-ab1c-77b3dd1a3a25
Content-Type: application/json

--- request body ---
{"handle":"qa-ac5b95593a73","password":"****"}

--- response: 401 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb87af62-d1bc-41ed-ab1c-77b3dd1a3a25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb87af62-d1bc-41ed-ab1c-77b3dd1a3a25"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4cae53c2-2f15-44b2-bf12-9a4d8574898c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cae53c2-2f15-44b2-bf12-9a4d8574898c
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4cae53c2-2f15-44b2-bf12-9a4d8574898c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-babbefa7-7758-4d8f-b911-cd163b2c5c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-babbefa7-7758-4d8f-b911-cd163b2c5c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-212eadf42aa8","password":"****"}

--- response: 401 in 78 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-babbefa7-7758-4d8f-b911-cd163b2c5c0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-babbefa7-7758-4d8f-b911-cd163b2c5c0c"}
```
