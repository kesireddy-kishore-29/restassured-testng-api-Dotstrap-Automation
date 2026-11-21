# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-ec75b062-c7bb-46cd-84cf-80abbd48b450` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-f60208c7-b978-4c71-9612-084aa67057be` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-f532d781-7bfe-4780-9fb7-09e1ff063b92` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-b65760ce-fa45-4f4b-9e31-a0df4163f56b` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 19 | `qa-bd896daa-159e-4b5a-b68c-69b8ad5d4d28` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-bb9583e5-8d4c-4447-b934-95a75664c5a8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-788d398a-7305-4739-ad12-dd1e949b166d` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-71555b4f-0d62-430d-94df-d4cef3ff53b3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-3672ce8c-9c92-4472-b0af-04d407f6cf9d` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-ca2120a3-ee50-4125-b979-4b0d061b36e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec75b062-c7bb-46cd-84cf-80abbd48b450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec75b062-c7bb-46cd-84cf-80abbd48b450
Content-Type: application/json

--- request body ---
{"handle":"qa-7bee7f2d8b2a","displayName":"QA 7bee7f2d8b2a","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec75b062-c7bb-46cd-84cf-80abbd48b450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-7bee7f2d8b2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89e91bb9-ae07-4b04-8379-d7af3d66e24e","handle":"qa-7bee7f2d8b2a","displayName":"QA 7bee7f2d8b2a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.506140475Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f60208c7-b978-4c71-9612-084aa67057be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60208c7-b978-4c71-9612-084aa67057be
Content-Type: application/json

--- request body ---
{"handle":"qa-20f054fc521a","displayName":"QA 20f054fc521a","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f60208c7-b978-4c71-9612-084aa67057be
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
Location: /v1/accounts/qa-20f054fc521a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a728c337-1102-45c9-961a-06ca5674b4b1","handle":"qa-20f054fc521a","displayName":"QA 20f054fc521a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.536016972Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f532d781-7bfe-4780-9fb7-09e1ff063b92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f532d781-7bfe-4780-9fb7-09e1ff063b92
Content-Type: application/json

--- request body ---
{"handle":"qa-7bee7f2d8b2a","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f532d781-7bfe-4780-9fb7-09e1ff063b92
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89e91bb9-ae07-4b04-8379-d7af3d66e24e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b65760ce-fa45-4f4b-9e31-a0df4163f56b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b65760ce-fa45-4f4b-9e31-a0df4163f56b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-20f054fc521a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b65760ce-fa45-4f4b-9e31-a0df4163f56b
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
Location: /v1/conversations/cnv_c6c38498-56e7-4165-9516-8e7e04b72af6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6c38498-56e7-4165-9516-8e7e04b72af6","subject":"Error contract","status":"open","region":"eu","participants":["qa-7bee7f2d8b2a","qa-20f054fc521a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.617532779Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c6c38498-56e7-4165-9516-8e7e04b72af6/read
correlation: qa-bd896daa-159e-4b5a-b68c-69b8ad5d4d28

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ad6ca69a-65b6-4c42-9c75-d3282030ffd1
X-Correlation-Id: qa-bd896daa-159e-4b5a-b68c-69b8ad5d4d28
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd896daa-159e-4b5a-b68c-69b8ad5d4d28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_c6c38498-56e7-4165-9516-8e7e04b72af6/read","correlationId":"qa-bd896daa-159e-4b5a-b68c-69b8ad5d4d28"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb9583e5-8d4c-4447-b934-95a75664c5a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb9583e5-8d4c-4447-b934-95a75664c5a8
Content-Type: application/json

--- request body ---
{"handle":"qa-20f054fc521a","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb9583e5-8d4c-4447-b934-95a75664c5a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a728c337-1102-45c9-961a-06ca5674b4b1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-788d398a-7305-4739-ad12-dd1e949b166d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-788d398a-7305-4739-ad12-dd1e949b166d
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-788d398a-7305-4739-ad12-dd1e949b166d
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
correlation: qa-71555b4f-0d62-430d-94df-d4cef3ff53b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71555b4f-0d62-430d-94df-d4cef3ff53b3
Content-Type: application/json

--- request body ---
{"handle":"qa-20f054fc521a","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71555b4f-0d62-430d-94df-d4cef3ff53b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71555b4f-0d62-430d-94df-d4cef3ff53b3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3672ce8c-9c92-4472-b0af-04d407f6cf9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3672ce8c-9c92-4472-b0af-04d407f6cf9d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3672ce8c-9c92-4472-b0af-04d407f6cf9d
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
correlation: qa-ca2120a3-ee50-4125-b979-4b0d061b36e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2120a3-ee50-4125-b979-4b0d061b36e9
Content-Type: application/json

--- request body ---
{"handle":"qa-7bee7f2d8b2a","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca2120a3-ee50-4125-b979-4b0d061b36e9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca2120a3-ee50-4125-b979-4b0d061b36e9"}
```
