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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-558b1829-b222-4735-9443-fec53e860fdd` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-9307a6c6-465c-4065-afd6-1cf32c9b1e02` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-65e577a9-646f-4eeb-815a-80c6682a1651` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-49efb141-ba26-44a0-a705-cf9239ffd17d` |
| 5 | `POST /v1/credits/purchases` | 400 | 20 | `qa-80a7df23-a90d-4ee7-835f-b27b71d745ae` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-09838891-acf3-4a6c-a7e7-3bfd3aa34256` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0dccf732-24f0-4ad8-8ae4-854de162f9a9` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-9d36e3bc-940d-44b2-b3c5-44ca775b337b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-9159f08f-0429-4b50-aa3c-237c1cea8184` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-2179dce2-4d14-4819-9e6e-34517c392bd2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-558b1829-b222-4735-9443-fec53e860fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-558b1829-b222-4735-9443-fec53e860fdd
Content-Type: application/json

--- request body ---
{"handle":"qa-bf97b4112a48","displayName":"QA bf97b4112a48","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-558b1829-b222-4735-9443-fec53e860fdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Location: /v1/accounts/qa-bf97b4112a48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b1215de-8cf8-4d88-ba41-3e4d39fc8bb7","handle":"qa-bf97b4112a48","displayName":"QA bf97b4112a48","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.975630215Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9307a6c6-465c-4065-afd6-1cf32c9b1e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9307a6c6-465c-4065-afd6-1cf32c9b1e02
Content-Type: application/json

--- request body ---
{"handle":"qa-464b17a0eb05","displayName":"QA 464b17a0eb05","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-9307a6c6-465c-4065-afd6-1cf32c9b1e02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Location: /v1/accounts/qa-464b17a0eb05
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7a958e0-2700-4ad0-a2cf-378b622a35aa","handle":"qa-464b17a0eb05","displayName":"QA 464b17a0eb05","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.034000053Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-65e577a9-646f-4eeb-815a-80c6682a1651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65e577a9-646f-4eeb-815a-80c6682a1651
Content-Type: application/json

--- request body ---
{"handle":"qa-bf97b4112a48","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-65e577a9-646f-4eeb-815a-80c6682a1651
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b1215de-8cf8-4d88-ba41-3e4d39fc8bb7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-49efb141-ba26-44a0-a705-cf9239ffd17d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49efb141-ba26-44a0-a705-cf9239ffd17d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-464b17a0eb05","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-49efb141-ba26-44a0-a705-cf9239ffd17d
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
Location: /v1/conversations/cnv_f617fdc5-8b08-49cc-a09a-c99f76215506
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f617fdc5-8b08-49cc-a09a-c99f76215506","subject":"Error contract","status":"open","region":"eu","participants":["qa-bf97b4112a48","qa-464b17a0eb05"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.220825605Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-80a7df23-a90d-4ee7-835f-b27b71d745ae

--- request headers ---
Accept: application/json
Idempotency-Key: qa-917e3f7f880e4554bf54a6a604a15a8a
X-Correlation-Id: qa-80a7df23-a90d-4ee7-835f-b27b71d745ae
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80a7df23-a90d-4ee7-835f-b27b71d745ae
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-80a7df23-a90d-4ee7-835f-b27b71d745ae"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-09838891-acf3-4a6c-a7e7-3bfd3aa34256

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09838891-acf3-4a6c-a7e7-3bfd3aa34256
Content-Type: application/json

--- request body ---
{"handle":"qa-464b17a0eb05","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-09838891-acf3-4a6c-a7e7-3bfd3aa34256
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7a958e0-2700-4ad0-a2cf-378b622a35aa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0dccf732-24f0-4ad8-8ae4-854de162f9a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dccf732-24f0-4ad8-8ae4-854de162f9a9
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0dccf732-24f0-4ad8-8ae4-854de162f9a9
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
correlation: qa-9d36e3bc-940d-44b2-b3c5-44ca775b337b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d36e3bc-940d-44b2-b3c5-44ca775b337b
Content-Type: application/json

--- request body ---
{"handle":"qa-464b17a0eb05","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d36e3bc-940d-44b2-b3c5-44ca775b337b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d36e3bc-940d-44b2-b3c5-44ca775b337b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9159f08f-0429-4b50-aa3c-237c1cea8184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9159f08f-0429-4b50-aa3c-237c1cea8184
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9159f08f-0429-4b50-aa3c-237c1cea8184
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
correlation: qa-2179dce2-4d14-4819-9e6e-34517c392bd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2179dce2-4d14-4819-9e6e-34517c392bd2
Content-Type: application/json

--- request body ---
{"handle":"qa-bf97b4112a48","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2179dce2-4d14-4819-9e6e-34517c392bd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2179dce2-4d14-4819-9e6e-34517c392bd2"}
```
