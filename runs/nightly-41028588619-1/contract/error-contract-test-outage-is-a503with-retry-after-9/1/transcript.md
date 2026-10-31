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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-9da3c715-a879-4e5e-a668-de7b333b707d` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-ec2fbd7c-f4e5-41ab-b937-4c30d460e88a` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-111c0ce1-96e3-4ae0-83a7-0784e87a41b0` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-37613135-cd40-4ecf-be41-f748a8020124` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 16 | `qa-d236a760-1330-404f-967f-806d68e0c166` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-0b7f6419-9008-47ad-91d3-8c7857bb9ed6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-1e9f3afc-1e6f-4d06-ba34-d00dd832b26e` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-42d7f8d4-599f-4144-b8a5-2f0e22f9e3cd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-d73e8171-00b2-43c3-9aea-a1b6d15c26d4` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-71abae5c-d935-4b83-9e0f-c54cb3c1acef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9da3c715-a879-4e5e-a668-de7b333b707d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9da3c715-a879-4e5e-a668-de7b333b707d
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f2d0ec5496","displayName":"QA f4f2d0ec5496","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9da3c715-a879-4e5e-a668-de7b333b707d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Location: /v1/accounts/qa-f4f2d0ec5496
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed2d0823-8913-491e-bd1e-7253309bfbec","handle":"qa-f4f2d0ec5496","displayName":"QA f4f2d0ec5496","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.431530388Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec2fbd7c-f4e5-41ab-b937-4c30d460e88a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec2fbd7c-f4e5-41ab-b937-4c30d460e88a
Content-Type: application/json

--- request body ---
{"handle":"qa-aec842a428e4","displayName":"QA aec842a428e4","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec2fbd7c-f4e5-41ab-b937-4c30d460e88a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Location: /v1/accounts/qa-aec842a428e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6928a593-d4e9-4e7f-b38e-d94c923bba0b","handle":"qa-aec842a428e4","displayName":"QA aec842a428e4","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.495051184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-111c0ce1-96e3-4ae0-83a7-0784e87a41b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-111c0ce1-96e3-4ae0-83a7-0784e87a41b0
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f2d0ec5496","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-111c0ce1-96e3-4ae0-83a7-0784e87a41b0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed2d0823-8913-491e-bd1e-7253309bfbec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37613135-cd40-4ecf-be41-f748a8020124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37613135-cd40-4ecf-be41-f748a8020124
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aec842a428e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-37613135-cd40-4ecf-be41-f748a8020124
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
Location: /v1/conversations/cnv_4972981d-2999-4cfd-8a50-e49e2b2337d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4972981d-2999-4cfd-8a50-e49e2b2337d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4f2d0ec5496","qa-aec842a428e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.594131980Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_4972981d-2999-4cfd-8a50-e49e2b2337d4/messages
correlation: qa-d236a760-1330-404f-967f-806d68e0c166

--- request headers ---
Accept: application/json
X-Fault-Key: 9a8cf9b3-77af-46f1-90be-2d8151b620f1
X-Fault: unavailable-once
X-Correlation-Id: qa-d236a760-1330-404f-967f-806d68e0c166
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d236a760-1330-404f-967f-806d68e0c166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_4972981d-2999-4cfd-8a50-e49e2b2337d4/messages","correlationId":"qa-d236a760-1330-404f-967f-806d68e0c166"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0b7f6419-9008-47ad-91d3-8c7857bb9ed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b7f6419-9008-47ad-91d3-8c7857bb9ed6
Content-Type: application/json

--- request body ---
{"handle":"qa-aec842a428e4","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b7f6419-9008-47ad-91d3-8c7857bb9ed6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6928a593-d4e9-4e7f-b38e-d94c923bba0b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e9f3afc-1e6f-4d06-ba34-d00dd832b26e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9f3afc-1e6f-4d06-ba34-d00dd832b26e
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e9f3afc-1e6f-4d06-ba34-d00dd832b26e
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
correlation: qa-42d7f8d4-599f-4144-b8a5-2f0e22f9e3cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d7f8d4-599f-4144-b8a5-2f0e22f9e3cd
Content-Type: application/json

--- request body ---
{"handle":"qa-aec842a428e4","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42d7f8d4-599f-4144-b8a5-2f0e22f9e3cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42d7f8d4-599f-4144-b8a5-2f0e22f9e3cd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d73e8171-00b2-43c3-9aea-a1b6d15c26d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d73e8171-00b2-43c3-9aea-a1b6d15c26d4
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d73e8171-00b2-43c3-9aea-a1b6d15c26d4
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
correlation: qa-71abae5c-d935-4b83-9e0f-c54cb3c1acef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71abae5c-d935-4b83-9e0f-c54cb3c1acef
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f2d0ec5496","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71abae5c-d935-4b83-9e0f-c54cb3c1acef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71abae5c-d935-4b83-9e0f-c54cb3c1acef"}
```
