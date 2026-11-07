# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 61 | `qa-fbdbf933-2806-4602-a95d-590b9b55d694` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-955b8c8d-1fa2-4332-b096-54d2cdfaeb9c` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-60ffb36b-5bd3-456c-918f-fe742ec0d6f9` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-ce959b31-63d3-4a76-a96d-80948942638b` |
| 5 | `POST /v1/accounts` | 503 | 12 | `qa-40dc3115-44cc-4e02-820e-de244b9ff0e8` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-60b8c4df-3fb6-42b9-bcfa-5186f6cba626` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-ee0b7055-8235-49ac-88aa-f4ea797aed7c` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-6c091eb6-d8c4-42da-b4d7-c78ffeaaa3a9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8043c32f-3634-4e2d-8f1c-1716f925ea01` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-c04968ba-ecb8-49eb-beaf-62ee8ea6354d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fbdbf933-2806-4602-a95d-590b9b55d694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbdbf933-2806-4602-a95d-590b9b55d694
Content-Type: application/json

--- request body ---
{"handle":"qa-ccac55a5c7b5","displayName":"QA ccac55a5c7b5","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbdbf933-2806-4602-a95d-590b9b55d694
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-ccac55a5c7b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44cb3c2d-eff0-4d95-9dcc-0d8d5086ebdb","handle":"qa-ccac55a5c7b5","displayName":"QA ccac55a5c7b5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.850678118Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-955b8c8d-1fa2-4332-b096-54d2cdfaeb9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-955b8c8d-1fa2-4332-b096-54d2cdfaeb9c
Content-Type: application/json

--- request body ---
{"handle":"qa-414eef2c5e79","displayName":"QA 414eef2c5e79","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-955b8c8d-1fa2-4332-b096-54d2cdfaeb9c
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
Location: /v1/accounts/qa-414eef2c5e79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d5d97f0-6a3b-43d7-9328-3c56341278d3","handle":"qa-414eef2c5e79","displayName":"QA 414eef2c5e79","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.908559187Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-60ffb36b-5bd3-456c-918f-fe742ec0d6f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ffb36b-5bd3-456c-918f-fe742ec0d6f9
Content-Type: application/json

--- request body ---
{"handle":"qa-ccac55a5c7b5","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-60ffb36b-5bd3-456c-918f-fe742ec0d6f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44cb3c2d-eff0-4d95-9dcc-0d8d5086ebdb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ce959b31-63d3-4a76-a96d-80948942638b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce959b31-63d3-4a76-a96d-80948942638b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-414eef2c5e79","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce959b31-63d3-4a76-a96d-80948942638b
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
Location: /v1/conversations/cnv_86f7880f-a09e-4869-bbd7-606ff066027c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_86f7880f-a09e-4869-bbd7-606ff066027c","subject":"Error contract","status":"open","region":"eu","participants":["qa-ccac55a5c7b5","qa-414eef2c5e79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.998190656Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-40dc3115-44cc-4e02-820e-de244b9ff0e8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8001c96f-cab4-4d16-9683-65f9b62972f6
X-Correlation-Id: qa-40dc3115-44cc-4e02-820e-de244b9ff0e8
Content-Type: application/json

--- request body ---
{"handle":"qa-4b5b24051c5f","displayName":"QA 4b5b24051c5f","password":"****","region":"eu"}

--- response: 503 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40dc3115-44cc-4e02-820e-de244b9ff0e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-40dc3115-44cc-4e02-820e-de244b9ff0e8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-60b8c4df-3fb6-42b9-bcfa-5186f6cba626

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60b8c4df-3fb6-42b9-bcfa-5186f6cba626
Content-Type: application/json

--- request body ---
{"handle":"qa-414eef2c5e79","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-60b8c4df-3fb6-42b9-bcfa-5186f6cba626
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d5d97f0-6a3b-43d7-9328-3c56341278d3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee0b7055-8235-49ac-88aa-f4ea797aed7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee0b7055-8235-49ac-88aa-f4ea797aed7c
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee0b7055-8235-49ac-88aa-f4ea797aed7c
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
correlation: qa-6c091eb6-d8c4-42da-b4d7-c78ffeaaa3a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c091eb6-d8c4-42da-b4d7-c78ffeaaa3a9
Content-Type: application/json

--- request body ---
{"handle":"qa-414eef2c5e79","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c091eb6-d8c4-42da-b4d7-c78ffeaaa3a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c091eb6-d8c4-42da-b4d7-c78ffeaaa3a9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8043c32f-3634-4e2d-8f1c-1716f925ea01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8043c32f-3634-4e2d-8f1c-1716f925ea01
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8043c32f-3634-4e2d-8f1c-1716f925ea01
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
correlation: qa-c04968ba-ecb8-49eb-beaf-62ee8ea6354d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c04968ba-ecb8-49eb-beaf-62ee8ea6354d
Content-Type: application/json

--- request body ---
{"handle":"qa-ccac55a5c7b5","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c04968ba-ecb8-49eb-beaf-62ee8ea6354d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c04968ba-ecb8-49eb-beaf-62ee8ea6354d"}
```
