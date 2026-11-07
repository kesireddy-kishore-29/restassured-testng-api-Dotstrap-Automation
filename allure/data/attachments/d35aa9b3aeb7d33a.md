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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-b571bc8b-5edf-4164-8d52-e92c9ad5edce` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-afda7ec1-755e-44d1-955a-b4812c9ece9e` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-4129ece6-f2eb-4541-9e13-4c1cffc4b48f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-151123b7-9e0a-4ad6-ba93-2e7d447c9996` |
| 5 | `POST /v1/conversations` | 400 | 6 | `qa-a60c80ed-9760-4aeb-b91a-51c5d59eeeaa` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-1b53317f-2af9-4515-998c-9ba4eb7b8a7d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-354d4207-dd26-474f-90d8-6699c073e36e` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-5af9b47c-47b1-4f1f-9027-323cca5f15f1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-59b160fd-cc22-45ec-8c23-1c1ef86e62f5` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-91d6b0c1-3674-4939-9418-73eadb8221c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b571bc8b-5edf-4164-8d52-e92c9ad5edce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b571bc8b-5edf-4164-8d52-e92c9ad5edce
Content-Type: application/json

--- request body ---
{"handle":"qa-8a779846d111","displayName":"QA 8a779846d111","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b571bc8b-5edf-4164-8d52-e92c9ad5edce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-8a779846d111
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c366c2a-e9fd-42ac-91a0-396bb4fcad97","handle":"qa-8a779846d111","displayName":"QA 8a779846d111","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.874492770Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-afda7ec1-755e-44d1-955a-b4812c9ece9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afda7ec1-755e-44d1-955a-b4812c9ece9e
Content-Type: application/json

--- request body ---
{"handle":"qa-25d2f3a593e6","displayName":"QA 25d2f3a593e6","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-afda7ec1-755e-44d1-955a-b4812c9ece9e
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
Location: /v1/accounts/qa-25d2f3a593e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97af4e17-e941-488f-9f14-764763152f27","handle":"qa-25d2f3a593e6","displayName":"QA 25d2f3a593e6","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.905618482Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4129ece6-f2eb-4541-9e13-4c1cffc4b48f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4129ece6-f2eb-4541-9e13-4c1cffc4b48f
Content-Type: application/json

--- request body ---
{"handle":"qa-8a779846d111","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4129ece6-f2eb-4541-9e13-4c1cffc4b48f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c366c2a-e9fd-42ac-91a0-396bb4fcad97"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-151123b7-9e0a-4ad6-ba93-2e7d447c9996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-151123b7-9e0a-4ad6-ba93-2e7d447c9996
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25d2f3a593e6","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-151123b7-9e0a-4ad6-ba93-2e7d447c9996
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
Location: /v1/conversations/cnv_aa0cf5c8-fc1a-4674-bf93-d41c143de475
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aa0cf5c8-fc1a-4674-bf93-d41c143de475","subject":"Error contract","status":"open","region":"eu","participants":["qa-8a779846d111","qa-25d2f3a593e6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.963972287Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a60c80ed-9760-4aeb-b91a-51c5d59eeeaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a60c80ed-9760-4aeb-b91a-51c5d59eeeaa
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a60c80ed-9760-4aeb-b91a-51c5d59eeeaa
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-a60c80ed-9760-4aeb-b91a-51c5d59eeeaa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1b53317f-2af9-4515-998c-9ba4eb7b8a7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b53317f-2af9-4515-998c-9ba4eb7b8a7d
Content-Type: application/json

--- request body ---
{"handle":"qa-25d2f3a593e6","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b53317f-2af9-4515-998c-9ba4eb7b8a7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97af4e17-e941-488f-9f14-764763152f27"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-354d4207-dd26-474f-90d8-6699c073e36e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-354d4207-dd26-474f-90d8-6699c073e36e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-354d4207-dd26-474f-90d8-6699c073e36e
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
correlation: qa-5af9b47c-47b1-4f1f-9027-323cca5f15f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af9b47c-47b1-4f1f-9027-323cca5f15f1
Content-Type: application/json

--- request body ---
{"handle":"qa-25d2f3a593e6","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5af9b47c-47b1-4f1f-9027-323cca5f15f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5af9b47c-47b1-4f1f-9027-323cca5f15f1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59b160fd-cc22-45ec-8c23-1c1ef86e62f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b160fd-cc22-45ec-8c23-1c1ef86e62f5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59b160fd-cc22-45ec-8c23-1c1ef86e62f5
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
correlation: qa-91d6b0c1-3674-4939-9418-73eadb8221c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91d6b0c1-3674-4939-9418-73eadb8221c3
Content-Type: application/json

--- request body ---
{"handle":"qa-8a779846d111","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91d6b0c1-3674-4939-9418-73eadb8221c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91d6b0c1-3674-4939-9418-73eadb8221c3"}
```
