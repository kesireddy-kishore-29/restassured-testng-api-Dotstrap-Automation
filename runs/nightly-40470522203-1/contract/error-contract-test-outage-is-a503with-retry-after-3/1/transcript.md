# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-be405dc1-b975-4f98-a35b-6deaf9e7bcac` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-5c5967ef-cd08-465a-ba27-58a2c8a5cfbe` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-0b64c50e-de90-4a9e-8944-c88522b60f47` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-791f0051-8699-426b-a234-9246fda94891` |
| 5 | `PATCH /v1/accounts/me` | 503 | 19 | `qa-1b71ebdf-3f67-467e-861e-89ce8e84e273` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-fa0cebb8-e150-4751-a3f9-a286e9e90567` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-02ad87cc-43a6-43a8-946d-e85b36fabdbc` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-96d33ab4-9d9d-4ddf-b6a8-6ffb15aa5d90` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-bd494008-fed5-4d30-bdd6-6bc755b4492d` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-9094edb3-27ef-485b-b6b4-de650cca4b6f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-be405dc1-b975-4f98-a35b-6deaf9e7bcac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be405dc1-b975-4f98-a35b-6deaf9e7bcac
Content-Type: application/json

--- request body ---
{"handle":"qa-4acc9916cadb","displayName":"QA 4acc9916cadb","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-be405dc1-b975-4f98-a35b-6deaf9e7bcac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-4acc9916cadb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b30e39e-8bf0-41ea-94a4-a055aba4969a","handle":"qa-4acc9916cadb","displayName":"QA 4acc9916cadb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.453991340Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5c5967ef-cd08-465a-ba27-58a2c8a5cfbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c5967ef-cd08-465a-ba27-58a2c8a5cfbe
Content-Type: application/json

--- request body ---
{"handle":"qa-a9a8bc2cdc6c","displayName":"QA a9a8bc2cdc6c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c5967ef-cd08-465a-ba27-58a2c8a5cfbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-a9a8bc2cdc6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_511c7f14-b974-4761-bdb1-928e1179a6dd","handle":"qa-a9a8bc2cdc6c","displayName":"QA a9a8bc2cdc6c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.507647895Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0b64c50e-de90-4a9e-8944-c88522b60f47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b64c50e-de90-4a9e-8944-c88522b60f47
Content-Type: application/json

--- request body ---
{"handle":"qa-4acc9916cadb","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b64c50e-de90-4a9e-8944-c88522b60f47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b30e39e-8bf0-41ea-94a4-a055aba4969a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-791f0051-8699-426b-a234-9246fda94891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-791f0051-8699-426b-a234-9246fda94891
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9a8bc2cdc6c","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-791f0051-8699-426b-a234-9246fda94891
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
Location: /v1/conversations/cnv_e92006c1-c371-422a-a6cd-61676120b87d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e92006c1-c371-422a-a6cd-61676120b87d","subject":"Error contract","status":"open","region":"eu","participants":["qa-4acc9916cadb","qa-a9a8bc2cdc6c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.612998696Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1b71ebdf-3f67-467e-861e-89ce8e84e273

--- request headers ---
Accept: application/json
X-Fault-Key: 7126ff5d-c550-4f48-8ac4-17655f1f45ee
X-Fault: unavailable-once
X-Correlation-Id: qa-1b71ebdf-3f67-467e-861e-89ce8e84e273
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b71ebdf-3f67-467e-861e-89ce8e84e273
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-1b71ebdf-3f67-467e-861e-89ce8e84e273"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fa0cebb8-e150-4751-a3f9-a286e9e90567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa0cebb8-e150-4751-a3f9-a286e9e90567
Content-Type: application/json

--- request body ---
{"handle":"qa-a9a8bc2cdc6c","password":"****"}

--- response: 200 in 57 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa0cebb8-e150-4751-a3f9-a286e9e90567
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_511c7f14-b974-4761-bdb1-928e1179a6dd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02ad87cc-43a6-43a8-946d-e85b36fabdbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ad87cc-43a6-43a8-946d-e85b36fabdbc
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02ad87cc-43a6-43a8-946d-e85b36fabdbc
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
correlation: qa-96d33ab4-9d9d-4ddf-b6a8-6ffb15aa5d90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d33ab4-9d9d-4ddf-b6a8-6ffb15aa5d90
Content-Type: application/json

--- request body ---
{"handle":"qa-a9a8bc2cdc6c","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96d33ab4-9d9d-4ddf-b6a8-6ffb15aa5d90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96d33ab4-9d9d-4ddf-b6a8-6ffb15aa5d90"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd494008-fed5-4d30-bdd6-6bc755b4492d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd494008-fed5-4d30-bdd6-6bc755b4492d
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd494008-fed5-4d30-bdd6-6bc755b4492d
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
correlation: qa-9094edb3-27ef-485b-b6b4-de650cca4b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9094edb3-27ef-485b-b6b4-de650cca4b6f
Content-Type: application/json

--- request body ---
{"handle":"qa-4acc9916cadb","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9094edb3-27ef-485b-b6b4-de650cca4b6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9094edb3-27ef-485b-b6b4-de650cca4b6f"}
```
