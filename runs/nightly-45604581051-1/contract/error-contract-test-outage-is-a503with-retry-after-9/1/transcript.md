# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-f5b3669a-7c25-44c9-b771-c17a056715cc` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-cac11439-8f91-4975-a884-f887afb038cc` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-74e299fb-8bca-42bc-9290-9a4d7729e410` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-2262c342-7df5-4493-b53f-36f7966a873d` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 13 | `qa-d98840b0-c2b6-48b3-bf45-d3fe20ad919b` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-0e931d1b-2620-44f9-b9c2-4a89581896c4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-91a087ab-d89e-4a20-b1b2-894583ea1af0` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-2f2e85e4-401c-496b-922e-aa454595b332` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-db23b5e6-b276-4cab-8a97-b526ef830b7d` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-b16923a6-5755-4673-b50c-cbdcfc88befa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f5b3669a-7c25-44c9-b771-c17a056715cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b3669a-7c25-44c9-b771-c17a056715cc
Content-Type: application/json

--- request body ---
{"handle":"qa-22ad47c86524","displayName":"QA 22ad47c86524","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5b3669a-7c25-44c9-b771-c17a056715cc
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
Location: /v1/accounts/qa-22ad47c86524
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e375868-5119-4364-83e4-df42398c1047","handle":"qa-22ad47c86524","displayName":"QA 22ad47c86524","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.942209357Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cac11439-8f91-4975-a884-f887afb038cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac11439-8f91-4975-a884-f887afb038cc
Content-Type: application/json

--- request body ---
{"handle":"qa-f7b1baa087a8","displayName":"QA f7b1baa087a8","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac11439-8f91-4975-a884-f887afb038cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Location: /v1/accounts/qa-f7b1baa087a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a844400-c782-4ad7-a149-f092b93d8704","handle":"qa-f7b1baa087a8","displayName":"QA f7b1baa087a8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.972005077Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-74e299fb-8bca-42bc-9290-9a4d7729e410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74e299fb-8bca-42bc-9290-9a4d7729e410
Content-Type: application/json

--- request body ---
{"handle":"qa-22ad47c86524","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-74e299fb-8bca-42bc-9290-9a4d7729e410
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e375868-5119-4364-83e4-df42398c1047"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2262c342-7df5-4493-b53f-36f7966a873d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2262c342-7df5-4493-b53f-36f7966a873d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f7b1baa087a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2262c342-7df5-4493-b53f-36f7966a873d
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
Location: /v1/conversations/cnv_8101ace2-3e73-49bd-8641-beaf2059408e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8101ace2-3e73-49bd-8641-beaf2059408e","subject":"Error contract","status":"open","region":"eu","participants":["qa-22ad47c86524","qa-f7b1baa087a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.005864206Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_8101ace2-3e73-49bd-8641-beaf2059408e/messages
correlation: qa-d98840b0-c2b6-48b3-bf45-d3fe20ad919b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bcaf8a71-7a8d-4fd0-a14f-24b74c803d0b
X-Correlation-Id: qa-d98840b0-c2b6-48b3-bf45-d3fe20ad919b
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d98840b0-c2b6-48b3-bf45-d3fe20ad919b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_8101ace2-3e73-49bd-8641-beaf2059408e/messages","correlationId":"qa-d98840b0-c2b6-48b3-bf45-d3fe20ad919b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0e931d1b-2620-44f9-b9c2-4a89581896c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e931d1b-2620-44f9-b9c2-4a89581896c4
Content-Type: application/json

--- request body ---
{"handle":"qa-f7b1baa087a8","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e931d1b-2620-44f9-b9c2-4a89581896c4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a844400-c782-4ad7-a149-f092b93d8704"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91a087ab-d89e-4a20-b1b2-894583ea1af0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a087ab-d89e-4a20-b1b2-894583ea1af0
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91a087ab-d89e-4a20-b1b2-894583ea1af0
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
correlation: qa-2f2e85e4-401c-496b-922e-aa454595b332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2e85e4-401c-496b-922e-aa454595b332
Content-Type: application/json

--- request body ---
{"handle":"qa-f7b1baa087a8","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f2e85e4-401c-496b-922e-aa454595b332
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f2e85e4-401c-496b-922e-aa454595b332"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db23b5e6-b276-4cab-8a97-b526ef830b7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db23b5e6-b276-4cab-8a97-b526ef830b7d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db23b5e6-b276-4cab-8a97-b526ef830b7d
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
correlation: qa-b16923a6-5755-4673-b50c-cbdcfc88befa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16923a6-5755-4673-b50c-cbdcfc88befa
Content-Type: application/json

--- request body ---
{"handle":"qa-22ad47c86524","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b16923a6-5755-4673-b50c-cbdcfc88befa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b16923a6-5755-4673-b50c-cbdcfc88befa"}
```
