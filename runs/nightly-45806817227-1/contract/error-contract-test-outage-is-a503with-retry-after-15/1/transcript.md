# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-6af26a20-d8c8-4298-9ede-6e8d50c8c4c8` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-516340f9-a467-497e-a3a4-56536c74eed6` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-d92e13d9-4ce5-4257-93b1-93ee35321157` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-98f22440-e956-402c-bda0-b62b4c76e0a0` |
| 5 | `POST /v1/credits/purchases` | 503 | 66 | `qa-5c9b0e34-3e39-4c3b-8bfd-a39946f778ef` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-922c1fd8-0ebc-403c-8b10-7af9d61ffea4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-0ed1dd1d-4ac6-489a-b46c-642d6aa18d26` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-557c4ddb-58a5-485b-a3da-c9a97ba8bdbd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-5a3cb9a6-addb-4bb0-9d71-f5c24544e204` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-6e4ef5a3-bb60-4a13-97ad-b076d4d87045` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6af26a20-d8c8-4298-9ede-6e8d50c8c4c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af26a20-d8c8-4298-9ede-6e8d50c8c4c8
Content-Type: application/json

--- request body ---
{"handle":"qa-303820aea16e","displayName":"QA 303820aea16e","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6af26a20-d8c8-4298-9ede-6e8d50c8c4c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Location: /v1/accounts/qa-303820aea16e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b9283ab-0154-4a03-a846-5571a3a3700e","handle":"qa-303820aea16e","displayName":"QA 303820aea16e","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.499174697Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-516340f9-a467-497e-a3a4-56536c74eed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-516340f9-a467-497e-a3a4-56536c74eed6
Content-Type: application/json

--- request body ---
{"handle":"qa-18d3aa828db4","displayName":"QA 18d3aa828db4","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-516340f9-a467-497e-a3a4-56536c74eed6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Location: /v1/accounts/qa-18d3aa828db4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ea853aa-52b8-4a46-b9e6-2ba5de4207ba","handle":"qa-18d3aa828db4","displayName":"QA 18d3aa828db4","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.540672883Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d92e13d9-4ce5-4257-93b1-93ee35321157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d92e13d9-4ce5-4257-93b1-93ee35321157
Content-Type: application/json

--- request body ---
{"handle":"qa-303820aea16e","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d92e13d9-4ce5-4257-93b1-93ee35321157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b9283ab-0154-4a03-a846-5571a3a3700e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-98f22440-e956-402c-bda0-b62b4c76e0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98f22440-e956-402c-bda0-b62b4c76e0a0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-18d3aa828db4","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f22440-e956-402c-bda0-b62b4c76e0a0
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
Location: /v1/conversations/cnv_9a4ddd48-6da7-40ed-86bf-009790d9cae0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9a4ddd48-6da7-40ed-86bf-009790d9cae0","subject":"Error contract","status":"open","region":"eu","participants":["qa-303820aea16e","qa-18d3aa828db4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.637729306Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5c9b0e34-3e39-4c3b-8bfd-a39946f778ef

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-8c6c7992f19146eaa978c54ce75953dc
X-Fault-Key: a2e8ff80-c71d-46a3-b5f2-11c1901807d9
X-Correlation-Id: qa-5c9b0e34-3e39-4c3b-8bfd-a39946f778ef
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 66 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c9b0e34-3e39-4c3b-8bfd-a39946f778ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-5c9b0e34-3e39-4c3b-8bfd-a39946f778ef"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-922c1fd8-0ebc-403c-8b10-7af9d61ffea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-922c1fd8-0ebc-403c-8b10-7af9d61ffea4
Content-Type: application/json

--- request body ---
{"handle":"qa-18d3aa828db4","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-922c1fd8-0ebc-403c-8b10-7af9d61ffea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ea853aa-52b8-4a46-b9e6-2ba5de4207ba"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ed1dd1d-4ac6-489a-b46c-642d6aa18d26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ed1dd1d-4ac6-489a-b46c-642d6aa18d26
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ed1dd1d-4ac6-489a-b46c-642d6aa18d26
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
correlation: qa-557c4ddb-58a5-485b-a3da-c9a97ba8bdbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-557c4ddb-58a5-485b-a3da-c9a97ba8bdbd
Content-Type: application/json

--- request body ---
{"handle":"qa-18d3aa828db4","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-557c4ddb-58a5-485b-a3da-c9a97ba8bdbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-557c4ddb-58a5-485b-a3da-c9a97ba8bdbd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a3cb9a6-addb-4bb0-9d71-f5c24544e204

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a3cb9a6-addb-4bb0-9d71-f5c24544e204
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a3cb9a6-addb-4bb0-9d71-f5c24544e204
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
correlation: qa-6e4ef5a3-bb60-4a13-97ad-b076d4d87045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4ef5a3-bb60-4a13-97ad-b076d4d87045
Content-Type: application/json

--- request body ---
{"handle":"qa-303820aea16e","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4ef5a3-bb60-4a13-97ad-b076d4d87045
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e4ef5a3-bb60-4a13-97ad-b076d4d87045"}
```
