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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-3cbed8d6-cb61-46c6-beac-a305d7872f7f` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-e011a89e-0445-405e-b270-efa22f4d5088` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-ef048ebd-a510-4e36-8df5-9cdb5bc92b00` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-2ee9636e-275e-437a-a32f-5562829dd256` |
| 5 | `PATCH /v1/accounts/me` | 400 | 8 | `qa-d1220f71-c958-4d5b-9e2a-60009c14f8eb` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-953355c4-de8d-4512-bb1f-27fe3ea5db9e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c001b8e9-64a1-4b6f-8665-33649b5ffaf9` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-dee5e6f1-9709-45d0-835b-e8fd9e73ab43` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-1c5166be-85aa-49ee-841a-6ecda9ba618e` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b119a2bc-88ae-48fc-88ab-efb0ca70d33c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3cbed8d6-cb61-46c6-beac-a305d7872f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cbed8d6-cb61-46c6-beac-a305d7872f7f
Content-Type: application/json

--- request body ---
{"handle":"qa-822b51da6c73","displayName":"QA 822b51da6c73","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cbed8d6-cb61-46c6-beac-a305d7872f7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-822b51da6c73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ca38eee-3462-411b-a54d-47c6c0a67f43","handle":"qa-822b51da6c73","displayName":"QA 822b51da6c73","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.464742878Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e011a89e-0445-405e-b270-efa22f4d5088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e011a89e-0445-405e-b270-efa22f4d5088
Content-Type: application/json

--- request body ---
{"handle":"qa-c4781f2d2823","displayName":"QA c4781f2d2823","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e011a89e-0445-405e-b270-efa22f4d5088
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-c4781f2d2823
X-Served-Region: eu
Content-Length: 181

{"id":"acc_125ea022-342b-4172-b684-e4d5711b510d","handle":"qa-c4781f2d2823","displayName":"QA c4781f2d2823","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.517549653Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ef048ebd-a510-4e36-8df5-9cdb5bc92b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef048ebd-a510-4e36-8df5-9cdb5bc92b00
Content-Type: application/json

--- request body ---
{"handle":"qa-822b51da6c73","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef048ebd-a510-4e36-8df5-9cdb5bc92b00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ca38eee-3462-411b-a54d-47c6c0a67f43"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2ee9636e-275e-437a-a32f-5562829dd256

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ee9636e-275e-437a-a32f-5562829dd256
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c4781f2d2823","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ee9636e-275e-437a-a32f-5562829dd256
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
Location: /v1/conversations/cnv_8a6189ea-ff8d-4c2a-bdca-4fad1a477627
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a6189ea-ff8d-4c2a-bdca-4fad1a477627","subject":"Error contract","status":"open","region":"eu","participants":["qa-822b51da6c73","qa-c4781f2d2823"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.582754115Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d1220f71-c958-4d5b-9e2a-60009c14f8eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1220f71-c958-4d5b-9e2a-60009c14f8eb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1220f71-c958-4d5b-9e2a-60009c14f8eb
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-d1220f71-c958-4d5b-9e2a-60009c14f8eb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-953355c4-de8d-4512-bb1f-27fe3ea5db9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-953355c4-de8d-4512-bb1f-27fe3ea5db9e
Content-Type: application/json

--- request body ---
{"handle":"qa-c4781f2d2823","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-953355c4-de8d-4512-bb1f-27fe3ea5db9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_125ea022-342b-4172-b684-e4d5711b510d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c001b8e9-64a1-4b6f-8665-33649b5ffaf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c001b8e9-64a1-4b6f-8665-33649b5ffaf9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c001b8e9-64a1-4b6f-8665-33649b5ffaf9
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
correlation: qa-dee5e6f1-9709-45d0-835b-e8fd9e73ab43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dee5e6f1-9709-45d0-835b-e8fd9e73ab43
Content-Type: application/json

--- request body ---
{"handle":"qa-c4781f2d2823","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dee5e6f1-9709-45d0-835b-e8fd9e73ab43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dee5e6f1-9709-45d0-835b-e8fd9e73ab43"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c5166be-85aa-49ee-841a-6ecda9ba618e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c5166be-85aa-49ee-841a-6ecda9ba618e
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c5166be-85aa-49ee-841a-6ecda9ba618e
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
correlation: qa-b119a2bc-88ae-48fc-88ab-efb0ca70d33c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b119a2bc-88ae-48fc-88ab-efb0ca70d33c
Content-Type: application/json

--- request body ---
{"handle":"qa-822b51da6c73","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b119a2bc-88ae-48fc-88ab-efb0ca70d33c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b119a2bc-88ae-48fc-88ab-efb0ca70d33c"}
```
