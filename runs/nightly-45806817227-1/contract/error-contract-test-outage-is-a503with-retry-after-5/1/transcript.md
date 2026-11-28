# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-e292c2e1-cfdb-4d52-9186-151fbe65365d` |
| 2 | `POST /v1/accounts` | 201 | 85 | `qa-ef5181db-3f4e-4792-b28c-bf79658125ed` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-d5134dd1-dc70-4b57-b39e-f21d15b7577e` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-c1ee2806-2275-4916-8964-2bd0d97f103c` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 18 | `qa-e8908349-bbf8-44ec-a571-dbaf9abeabec` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-6e33af51-7075-4eb8-aff8-3b502f45751f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-59de2fd1-f65b-4fec-8bf9-05533e5e1ff3` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-57f2b8b9-0c8b-4b3d-a92f-0083ed0b9eda` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-d8f4f098-fe70-4f95-a088-b3bb838d551b` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-3281ef64-a171-47c0-9a3c-4ed5fee73a01` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e292c2e1-cfdb-4d52-9186-151fbe65365d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e292c2e1-cfdb-4d52-9186-151fbe65365d
Content-Type: application/json

--- request body ---
{"handle":"qa-d012e65eba58","displayName":"QA d012e65eba58","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e292c2e1-cfdb-4d52-9186-151fbe65365d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-d012e65eba58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b66f1c7-a870-4d7c-88cc-992131a0e24a","handle":"qa-d012e65eba58","displayName":"QA d012e65eba58","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.252889766Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ef5181db-3f4e-4792-b28c-bf79658125ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef5181db-3f4e-4792-b28c-bf79658125ed
Content-Type: application/json

--- request body ---
{"handle":"qa-93dc2c7f9133","displayName":"QA 93dc2c7f9133","password":"****","region":"eu"}

--- response: 201 in 85 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef5181db-3f4e-4792-b28c-bf79658125ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-93dc2c7f9133
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f864e78b-166f-4096-b892-d14ebb5cd301","handle":"qa-93dc2c7f9133","displayName":"QA 93dc2c7f9133","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.367180516Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d5134dd1-dc70-4b57-b39e-f21d15b7577e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5134dd1-dc70-4b57-b39e-f21d15b7577e
Content-Type: application/json

--- request body ---
{"handle":"qa-d012e65eba58","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5134dd1-dc70-4b57-b39e-f21d15b7577e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b66f1c7-a870-4d7c-88cc-992131a0e24a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c1ee2806-2275-4916-8964-2bd0d97f103c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1ee2806-2275-4916-8964-2bd0d97f103c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93dc2c7f9133","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1ee2806-2275-4916-8964-2bd0d97f103c
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
Location: /v1/conversations/cnv_f3fc0a05-2fe2-4c76-a152-bf267e22631a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3fc0a05-2fe2-4c76-a152-bf267e22631a","subject":"Error contract","status":"open","region":"eu","participants":["qa-d012e65eba58","qa-93dc2c7f9133"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.479499891Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-d012e65eba58
correlation: qa-e8908349-bbf8-44ec-a571-dbaf9abeabec

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2190ea5e-5a62-4e4f-a506-161c09b5daa2
X-Correlation-Id: qa-e8908349-bbf8-44ec-a571-dbaf9abeabec
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8908349-bbf8-44ec-a571-dbaf9abeabec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-d012e65eba58","correlationId":"qa-e8908349-bbf8-44ec-a571-dbaf9abeabec"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6e33af51-7075-4eb8-aff8-3b502f45751f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e33af51-7075-4eb8-aff8-3b502f45751f
Content-Type: application/json

--- request body ---
{"handle":"qa-93dc2c7f9133","password":"****"}

--- response: 200 in 56 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e33af51-7075-4eb8-aff8-3b502f45751f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f864e78b-166f-4096-b892-d14ebb5cd301"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59de2fd1-f65b-4fec-8bf9-05533e5e1ff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59de2fd1-f65b-4fec-8bf9-05533e5e1ff3
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59de2fd1-f65b-4fec-8bf9-05533e5e1ff3
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
correlation: qa-57f2b8b9-0c8b-4b3d-a92f-0083ed0b9eda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57f2b8b9-0c8b-4b3d-a92f-0083ed0b9eda
Content-Type: application/json

--- request body ---
{"handle":"qa-93dc2c7f9133","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57f2b8b9-0c8b-4b3d-a92f-0083ed0b9eda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57f2b8b9-0c8b-4b3d-a92f-0083ed0b9eda"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8f4f098-fe70-4f95-a088-b3bb838d551b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f4f098-fe70-4f95-a088-b3bb838d551b
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8f4f098-fe70-4f95-a088-b3bb838d551b
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
correlation: qa-3281ef64-a171-47c0-9a3c-4ed5fee73a01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3281ef64-a171-47c0-9a3c-4ed5fee73a01
Content-Type: application/json

--- request body ---
{"handle":"qa-d012e65eba58","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3281ef64-a171-47c0-9a3c-4ed5fee73a01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3281ef64-a171-47c0-9a3c-4ed5fee73a01"}
```
