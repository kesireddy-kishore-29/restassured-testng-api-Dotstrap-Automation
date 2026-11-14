# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-93eaab80-0c49-46d2-98cd-a2e99f1752fc` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-f49f5ff2-935e-43e8-833f-0d21c6a9cd8b` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-dbeaf67f-05a9-47bd-be32-c1ce9973edf4` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-cce49759-edf9-4be4-9118-7a0f321db242` |
| 5 | `GET /v1/admin/stats` | 503 | 5 | `qa-ab17e4e9-2832-404f-8489-c432b733bc94` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-5e5a50c8-dbb5-49ab-b31e-51dea2c336f0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-cf656364-38a1-47b1-b47c-e321df66ae84` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-9e49e30d-3529-497f-9af2-1a19d9ffaf18` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ca463c52-815e-4083-a620-7a1b46564fe3` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-b0e12697-dbfb-4d44-ab23-8c7169462e66` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-93eaab80-0c49-46d2-98cd-a2e99f1752fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93eaab80-0c49-46d2-98cd-a2e99f1752fc
Content-Type: application/json

--- request body ---
{"handle":"qa-fee0986a9d8b","displayName":"QA fee0986a9d8b","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-93eaab80-0c49-46d2-98cd-a2e99f1752fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Location: /v1/accounts/qa-fee0986a9d8b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7440964b-0887-4f26-b571-054fd7a75977","handle":"qa-fee0986a9d8b","displayName":"QA fee0986a9d8b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.378772761Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f49f5ff2-935e-43e8-833f-0d21c6a9cd8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f49f5ff2-935e-43e8-833f-0d21c6a9cd8b
Content-Type: application/json

--- request body ---
{"handle":"qa-8ef63946abaa","displayName":"QA 8ef63946abaa","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f49f5ff2-935e-43e8-833f-0d21c6a9cd8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Location: /v1/accounts/qa-8ef63946abaa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3327e5a6-b9c4-4d1a-b95d-92ea886eb01e","handle":"qa-8ef63946abaa","displayName":"QA 8ef63946abaa","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.410308931Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dbeaf67f-05a9-47bd-be32-c1ce9973edf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbeaf67f-05a9-47bd-be32-c1ce9973edf4
Content-Type: application/json

--- request body ---
{"handle":"qa-fee0986a9d8b","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbeaf67f-05a9-47bd-be32-c1ce9973edf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7440964b-0887-4f26-b571-054fd7a75977"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cce49759-edf9-4be4-9118-7a0f321db242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cce49759-edf9-4be4-9118-7a0f321db242
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ef63946abaa","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-cce49759-edf9-4be4-9118-7a0f321db242
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
Location: /v1/conversations/cnv_99beee1f-189b-46fb-bed2-4cd78af117e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_99beee1f-189b-46fb-bed2-4cd78af117e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-fee0986a9d8b","qa-8ef63946abaa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.485738612Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-ab17e4e9-2832-404f-8489-c432b733bc94

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f606dc2e-3e79-4cb2-8cfa-3004ef67f071
X-Correlation-Id: qa-ab17e4e9-2832-404f-8489-c432b733bc94
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab17e4e9-2832-404f-8489-c432b733bc94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-ab17e4e9-2832-404f-8489-c432b733bc94"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5e5a50c8-dbb5-49ab-b31e-51dea2c336f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e5a50c8-dbb5-49ab-b31e-51dea2c336f0
Content-Type: application/json

--- request body ---
{"handle":"qa-8ef63946abaa","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e5a50c8-dbb5-49ab-b31e-51dea2c336f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3327e5a6-b9c4-4d1a-b95d-92ea886eb01e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf656364-38a1-47b1-b47c-e321df66ae84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf656364-38a1-47b1-b47c-e321df66ae84
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf656364-38a1-47b1-b47c-e321df66ae84
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
correlation: qa-9e49e30d-3529-497f-9af2-1a19d9ffaf18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e49e30d-3529-497f-9af2-1a19d9ffaf18
Content-Type: application/json

--- request body ---
{"handle":"qa-8ef63946abaa","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e49e30d-3529-497f-9af2-1a19d9ffaf18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e49e30d-3529-497f-9af2-1a19d9ffaf18"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca463c52-815e-4083-a620-7a1b46564fe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca463c52-815e-4083-a620-7a1b46564fe3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca463c52-815e-4083-a620-7a1b46564fe3
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
correlation: qa-b0e12697-dbfb-4d44-ab23-8c7169462e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0e12697-dbfb-4d44-ab23-8c7169462e66
Content-Type: application/json

--- request body ---
{"handle":"qa-fee0986a9d8b","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0e12697-dbfb-4d44-ab23-8c7169462e66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0e12697-dbfb-4d44-ab23-8c7169462e66"}
```
