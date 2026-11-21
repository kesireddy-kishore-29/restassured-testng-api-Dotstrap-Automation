# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-f64b63ed-5e4c-4793-a714-62ba966e9cf9` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-a1ac1957-508d-4ff9-b346-ef262b6ace55` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-3cf32883-0907-40f4-a295-85cad26b0d62` |
| 4 | `POST /v1/conversations` | 201 | 2 | `qa-f7b97ad3-a1e0-44fb-8b64-77d6a2f658c4` |
| 5 | `POST /v1/credits/purchases` | 422 | 2 | `qa-a246789f-7438-4e14-ba80-90b20495d8fa` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-6c1a2c9d-98b0-4682-be85-e74a5100d524` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-387620c3-eafa-43d8-8b8b-71fbb70d5d78` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-35a1af3d-ca5f-4631-9b20-871d18953099` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7009b826-1338-4797-9bd1-3518a9fecc14` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-fb2945d5-8b9b-40e3-9d14-43bdacdcc2f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f64b63ed-5e4c-4793-a714-62ba966e9cf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f64b63ed-5e4c-4793-a714-62ba966e9cf9
Content-Type: application/json

--- request body ---
{"handle":"qa-a67d723a9415","displayName":"QA a67d723a9415","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f64b63ed-5e4c-4793-a714-62ba966e9cf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 8
Location: /v1/accounts/qa-a67d723a9415
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f4236c6-5e99-464c-88dc-1fa13c17a710","handle":"qa-a67d723a9415","displayName":"QA a67d723a9415","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.217793841Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1ac1957-508d-4ff9-b346-ef262b6ace55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1ac1957-508d-4ff9-b346-ef262b6ace55
Content-Type: application/json

--- request body ---
{"handle":"qa-e775ecda8baa","displayName":"QA e775ecda8baa","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1ac1957-508d-4ff9-b346-ef262b6ace55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Location: /v1/accounts/qa-e775ecda8baa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bcbff28-a592-4a10-b59d-de97af98540b","handle":"qa-e775ecda8baa","displayName":"QA e775ecda8baa","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.249338279Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3cf32883-0907-40f4-a295-85cad26b0d62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cf32883-0907-40f4-a295-85cad26b0d62
Content-Type: application/json

--- request body ---
{"handle":"qa-a67d723a9415","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cf32883-0907-40f4-a295-85cad26b0d62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f4236c6-5e99-464c-88dc-1fa13c17a710"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f7b97ad3-a1e0-44fb-8b64-77d6a2f658c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7b97ad3-a1e0-44fb-8b64-77d6a2f658c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e775ecda8baa","subject":"Error contract","message":"Hi"}

--- response: 201 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7b97ad3-a1e0-44fb-8b64-77d6a2f658c4
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
Location: /v1/conversations/cnv_6a39d192-8320-4eda-858f-d1fab2c2cac3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6a39d192-8320-4eda-858f-d1fab2c2cac3","subject":"Error contract","status":"open","region":"eu","participants":["qa-a67d723a9415","qa-e775ecda8baa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:32.277403881Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a246789f-7438-4e14-ba80-90b20495d8fa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7ca7bd1d72fb4939bd337286bd08ece9
X-Correlation-Id: qa-a246789f-7438-4e14-ba80-90b20495d8fa
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a246789f-7438-4e14-ba80-90b20495d8fa
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-a246789f-7438-4e14-ba80-90b20495d8fa","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6c1a2c9d-98b0-4682-be85-e74a5100d524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c1a2c9d-98b0-4682-be85-e74a5100d524
Content-Type: application/json

--- request body ---
{"handle":"qa-e775ecda8baa","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c1a2c9d-98b0-4682-be85-e74a5100d524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bcbff28-a592-4a10-b59d-de97af98540b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-387620c3-eafa-43d8-8b8b-71fbb70d5d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387620c3-eafa-43d8-8b8b-71fbb70d5d78
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-387620c3-eafa-43d8-8b8b-71fbb70d5d78
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
correlation: qa-35a1af3d-ca5f-4631-9b20-871d18953099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a1af3d-ca5f-4631-9b20-871d18953099
Content-Type: application/json

--- request body ---
{"handle":"qa-e775ecda8baa","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35a1af3d-ca5f-4631-9b20-871d18953099
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35a1af3d-ca5f-4631-9b20-871d18953099"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7009b826-1338-4797-9bd1-3518a9fecc14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7009b826-1338-4797-9bd1-3518a9fecc14
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7009b826-1338-4797-9bd1-3518a9fecc14
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
correlation: qa-fb2945d5-8b9b-40e3-9d14-43bdacdcc2f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb2945d5-8b9b-40e3-9d14-43bdacdcc2f2
Content-Type: application/json

--- request body ---
{"handle":"qa-a67d723a9415","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb2945d5-8b9b-40e3-9d14-43bdacdcc2f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb2945d5-8b9b-40e3-9d14-43bdacdcc2f2"}
```
