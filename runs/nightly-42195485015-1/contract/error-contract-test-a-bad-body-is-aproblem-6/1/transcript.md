# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-96290fe7-d51f-4d91-8d74-b273899f8d04` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-359c386d-ee83-4f66-b905-e9004269122f` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-5e32aa46-a924-49f9-96c3-c13646b00905` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-49f949c6-ec5b-4792-b4d1-a6feca517628` |
| 5 | `PATCH /v1/accounts/me` | 400 | 20 | `qa-846ffee7-6ad2-420e-8c0f-7c369fed866a` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-da84b66b-6ce9-42df-beff-e35a982eee84` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-54628085-1d37-4cd2-a672-c4e1e27d7c14` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-b6d0dad7-3784-4a98-b634-d3b3fce3fb2d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8c490ea1-96e0-458c-b92c-2b51399c3de9` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-ccef4a15-3b31-4936-a4ca-4beed33533cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-96290fe7-d51f-4d91-8d74-b273899f8d04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96290fe7-d51f-4d91-8d74-b273899f8d04
Content-Type: application/json

--- request body ---
{"handle":"qa-3a5cd013e1c6","displayName":"QA 3a5cd013e1c6","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-96290fe7-d51f-4d91-8d74-b273899f8d04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-3a5cd013e1c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7474a2c3-06a0-4727-b66d-7c7c6dc7e4bc","handle":"qa-3a5cd013e1c6","displayName":"QA 3a5cd013e1c6","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.984265346Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-359c386d-ee83-4f66-b905-e9004269122f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359c386d-ee83-4f66-b905-e9004269122f
Content-Type: application/json

--- request body ---
{"handle":"qa-0a6c7a22fa0c","displayName":"QA 0a6c7a22fa0c","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-359c386d-ee83-4f66-b905-e9004269122f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 7
Location: /v1/accounts/qa-0a6c7a22fa0c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da64eafe-aad5-4760-a632-5696bd0bca88","handle":"qa-0a6c7a22fa0c","displayName":"QA 0a6c7a22fa0c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.047304317Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5e32aa46-a924-49f9-96c3-c13646b00905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e32aa46-a924-49f9-96c3-c13646b00905
Content-Type: application/json

--- request body ---
{"handle":"qa-3a5cd013e1c6","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e32aa46-a924-49f9-96c3-c13646b00905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7474a2c3-06a0-4727-b66d-7c7c6dc7e4bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-49f949c6-ec5b-4792-b4d1-a6feca517628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49f949c6-ec5b-4792-b4d1-a6feca517628
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a6c7a22fa0c","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-49f949c6-ec5b-4792-b4d1-a6feca517628
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
Location: /v1/conversations/cnv_7abc8a7d-4e70-4168-9a56-76f87cd507df
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7abc8a7d-4e70-4168-9a56-76f87cd507df","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a5cd013e1c6","qa-0a6c7a22fa0c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.167399896Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-846ffee7-6ad2-420e-8c0f-7c369fed866a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-846ffee7-6ad2-420e-8c0f-7c369fed866a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-846ffee7-6ad2-420e-8c0f-7c369fed866a
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-846ffee7-6ad2-420e-8c0f-7c369fed866a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da84b66b-6ce9-42df-beff-e35a982eee84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da84b66b-6ce9-42df-beff-e35a982eee84
Content-Type: application/json

--- request body ---
{"handle":"qa-0a6c7a22fa0c","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-da84b66b-6ce9-42df-beff-e35a982eee84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da64eafe-aad5-4760-a632-5696bd0bca88"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54628085-1d37-4cd2-a672-c4e1e27d7c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54628085-1d37-4cd2-a672-c4e1e27d7c14
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54628085-1d37-4cd2-a672-c4e1e27d7c14
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
correlation: qa-b6d0dad7-3784-4a98-b634-d3b3fce3fb2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6d0dad7-3784-4a98-b634-d3b3fce3fb2d
Content-Type: application/json

--- request body ---
{"handle":"qa-0a6c7a22fa0c","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6d0dad7-3784-4a98-b634-d3b3fce3fb2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6d0dad7-3784-4a98-b634-d3b3fce3fb2d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c490ea1-96e0-458c-b92c-2b51399c3de9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c490ea1-96e0-458c-b92c-2b51399c3de9
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c490ea1-96e0-458c-b92c-2b51399c3de9
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
correlation: qa-ccef4a15-3b31-4936-a4ca-4beed33533cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccef4a15-3b31-4936-a4ca-4beed33533cf
Content-Type: application/json

--- request body ---
{"handle":"qa-3a5cd013e1c6","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccef4a15-3b31-4936-a4ca-4beed33533cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccef4a15-3b31-4936-a4ca-4beed33533cf"}
```
