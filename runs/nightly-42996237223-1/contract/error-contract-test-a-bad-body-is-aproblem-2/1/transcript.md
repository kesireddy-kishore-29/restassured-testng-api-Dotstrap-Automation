# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-4bf0a04e-778d-4c14-832c-b6d838082141` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-d382922d-0d65-4d88-9192-fb4a26f8ed07` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-5509c6d1-3a89-4f35-8ef1-376d70935826` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-838cfed1-2e94-402b-a345-fd25da1c1f16` |
| 5 | `POST /v1/auth/token` | 422 | 51 | `qa-984f6415-282d-430e-add8-4ada43606e77` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-98663ab4-7001-4080-aa0e-789f0bdb3433` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-9744e135-b431-487b-895e-ac9c7b85f250` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-7f65c38b-b961-4cbc-b546-211cad9cfaac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 67 | `qa-7893033f-a043-4f09-a538-a99d36b567fe` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-2aad384a-0212-4db5-a2e3-b754cfdc7f50` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4bf0a04e-778d-4c14-832c-b6d838082141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bf0a04e-778d-4c14-832c-b6d838082141
Content-Type: application/json

--- request body ---
{"handle":"qa-bcce9ac89781","displayName":"QA bcce9ac89781","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bf0a04e-778d-4c14-832c-b6d838082141
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
Location: /v1/accounts/qa-bcce9ac89781
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31416174-01d2-40da-a46a-93ba8d1b85b6","handle":"qa-bcce9ac89781","displayName":"QA bcce9ac89781","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.049359500Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d382922d-0d65-4d88-9192-fb4a26f8ed07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d382922d-0d65-4d88-9192-fb4a26f8ed07
Content-Type: application/json

--- request body ---
{"handle":"qa-27efd41263f3","displayName":"QA 27efd41263f3","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d382922d-0d65-4d88-9192-fb4a26f8ed07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-27efd41263f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b778ad5-8d05-41a6-92c0-87633ae7c054","handle":"qa-27efd41263f3","displayName":"QA 27efd41263f3","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.101430518Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5509c6d1-3a89-4f35-8ef1-376d70935826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5509c6d1-3a89-4f35-8ef1-376d70935826
Content-Type: application/json

--- request body ---
{"handle":"qa-bcce9ac89781","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5509c6d1-3a89-4f35-8ef1-376d70935826
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31416174-01d2-40da-a46a-93ba8d1b85b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-838cfed1-2e94-402b-a345-fd25da1c1f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-838cfed1-2e94-402b-a345-fd25da1c1f16
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-27efd41263f3","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-838cfed1-2e94-402b-a345-fd25da1c1f16
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
Location: /v1/conversations/cnv_c46be0c9-7358-41f5-8fbd-3a0dc3bef1da
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c46be0c9-7358-41f5-8fbd-3a0dc3bef1da","subject":"Error contract","status":"open","region":"eu","participants":["qa-bcce9ac89781","qa-27efd41263f3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.209269808Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-984f6415-282d-430e-add8-4ada43606e77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-984f6415-282d-430e-add8-4ada43606e77
Content-Type: application/json

--- request body ---
{"handle":"qa-bcce9ac89781","password":"****","ttlSeconds":0}

--- response: 422 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-984f6415-282d-430e-add8-4ada43606e77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-984f6415-282d-430e-add8-4ada43606e77","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-98663ab4-7001-4080-aa0e-789f0bdb3433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98663ab4-7001-4080-aa0e-789f0bdb3433
Content-Type: application/json

--- request body ---
{"handle":"qa-27efd41263f3","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-98663ab4-7001-4080-aa0e-789f0bdb3433
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b778ad5-8d05-41a6-92c0-87633ae7c054"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9744e135-b431-487b-895e-ac9c7b85f250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9744e135-b431-487b-895e-ac9c7b85f250
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9744e135-b431-487b-895e-ac9c7b85f250
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
correlation: qa-7f65c38b-b961-4cbc-b546-211cad9cfaac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f65c38b-b961-4cbc-b546-211cad9cfaac
Content-Type: application/json

--- request body ---
{"handle":"qa-27efd41263f3","password":"****"}

--- response: 401 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f65c38b-b961-4cbc-b546-211cad9cfaac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f65c38b-b961-4cbc-b546-211cad9cfaac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7893033f-a043-4f09-a538-a99d36b567fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7893033f-a043-4f09-a538-a99d36b567fe
Content-Type: application/json

--- response: 204 in 67 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7893033f-a043-4f09-a538-a99d36b567fe
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
correlation: qa-2aad384a-0212-4db5-a2e3-b754cfdc7f50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aad384a-0212-4db5-a2e3-b754cfdc7f50
Content-Type: application/json

--- request body ---
{"handle":"qa-bcce9ac89781","password":"****"}

--- response: 401 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2aad384a-0212-4db5-a2e3-b754cfdc7f50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2aad384a-0212-4db5-a2e3-b754cfdc7f50"}
```
