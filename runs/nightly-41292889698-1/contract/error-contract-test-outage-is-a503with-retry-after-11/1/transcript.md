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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-41527b1b-1f5e-49b3-8d8d-1f9856665840` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-bf93af71-e194-470c-a2a5-5901b1f1fe40` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-783e9a71-4012-4700-a99e-467885279eb7` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-5ce50632-850b-4f94-8fb7-9a9e66e68453` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 12 | `qa-2f34bfbb-f5f8-4590-a0ca-281c91d748f7` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-7543b640-2036-4ee3-97b3-e97e80c1a61d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a3bf7840-8ab0-4185-9474-065505ccb5a7` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-e375a7ab-40ae-409f-9ae9-be028b83d622` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-fc2be845-7424-4074-a0fa-d7f611d9d3f2` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-8c6e9a6d-783d-4b6d-88a0-e6033701194d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41527b1b-1f5e-49b3-8d8d-1f9856665840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41527b1b-1f5e-49b3-8d8d-1f9856665840
Content-Type: application/json

--- request body ---
{"handle":"qa-7e6905696122","displayName":"QA 7e6905696122","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-41527b1b-1f5e-49b3-8d8d-1f9856665840
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
Location: /v1/accounts/qa-7e6905696122
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f640457d-6fdc-47dc-ae7a-35f19fcc8114","handle":"qa-7e6905696122","displayName":"QA 7e6905696122","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.096912682Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bf93af71-e194-470c-a2a5-5901b1f1fe40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf93af71-e194-470c-a2a5-5901b1f1fe40
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b107c55f1d","displayName":"QA e5b107c55f1d","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf93af71-e194-470c-a2a5-5901b1f1fe40
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
Location: /v1/accounts/qa-e5b107c55f1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc496663-b3a4-4f57-b775-fcdb77c55065","handle":"qa-e5b107c55f1d","displayName":"QA e5b107c55f1d","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.165036991Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-783e9a71-4012-4700-a99e-467885279eb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783e9a71-4012-4700-a99e-467885279eb7
Content-Type: application/json

--- request body ---
{"handle":"qa-7e6905696122","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-783e9a71-4012-4700-a99e-467885279eb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f640457d-6fdc-47dc-ae7a-35f19fcc8114"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5ce50632-850b-4f94-8fb7-9a9e66e68453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce50632-850b-4f94-8fb7-9a9e66e68453
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e5b107c55f1d","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ce50632-850b-4f94-8fb7-9a9e66e68453
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
Location: /v1/conversations/cnv_88a35419-8aa5-47b0-87dd-7138cf31f7e5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88a35419-8aa5-47b0-87dd-7138cf31f7e5","subject":"Error contract","status":"open","region":"eu","participants":["qa-7e6905696122","qa-e5b107c55f1d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.264344407Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_88a35419-8aa5-47b0-87dd-7138cf31f7e5/read
correlation: qa-2f34bfbb-f5f8-4590-a0ca-281c91d748f7

--- request headers ---
Accept: application/json
X-Fault-Key: 888808f0-352a-4058-8e42-5b371323ed2e
X-Fault: unavailable-once
X-Correlation-Id: qa-2f34bfbb-f5f8-4590-a0ca-281c91d748f7
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f34bfbb-f5f8-4590-a0ca-281c91d748f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_88a35419-8aa5-47b0-87dd-7138cf31f7e5/read","correlationId":"qa-2f34bfbb-f5f8-4590-a0ca-281c91d748f7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7543b640-2036-4ee3-97b3-e97e80c1a61d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7543b640-2036-4ee3-97b3-e97e80c1a61d
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b107c55f1d","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7543b640-2036-4ee3-97b3-e97e80c1a61d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc496663-b3a4-4f57-b775-fcdb77c55065"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3bf7840-8ab0-4185-9474-065505ccb5a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3bf7840-8ab0-4185-9474-065505ccb5a7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3bf7840-8ab0-4185-9474-065505ccb5a7
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
correlation: qa-e375a7ab-40ae-409f-9ae9-be028b83d622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e375a7ab-40ae-409f-9ae9-be028b83d622
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b107c55f1d","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e375a7ab-40ae-409f-9ae9-be028b83d622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e375a7ab-40ae-409f-9ae9-be028b83d622"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc2be845-7424-4074-a0fa-d7f611d9d3f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc2be845-7424-4074-a0fa-d7f611d9d3f2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc2be845-7424-4074-a0fa-d7f611d9d3f2
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
correlation: qa-8c6e9a6d-783d-4b6d-88a0-e6033701194d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c6e9a6d-783d-4b6d-88a0-e6033701194d
Content-Type: application/json

--- request body ---
{"handle":"qa-7e6905696122","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c6e9a6d-783d-4b6d-88a0-e6033701194d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c6e9a6d-783d-4b6d-88a0-e6033701194d"}
```
