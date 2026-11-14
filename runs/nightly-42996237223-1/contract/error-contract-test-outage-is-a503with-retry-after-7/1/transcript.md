# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-9171d4ec-4fc8-4e42-b12a-ec3f89080728` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-466e5797-e48e-4391-a81d-ba6793fceff1` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-219e8419-30b5-472c-a451-1877263ff6f7` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-e0a6f774-7261-42d5-bd60-41d517559f06` |
| 5 | `GET /v1/conversations` | 503 | 22 | `qa-7babfab1-48f1-4330-8356-89f2f87ed0b4` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-02a69bd1-eae4-43ab-9679-6a5dbd8e2417` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-ce425032-d576-4d4c-a640-a6dfbd5415fd` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-2897bef1-4ecc-49d8-8fc3-85b4dae6c11c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-73e3203a-fdcc-4687-acc4-a40896880b61` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-6f82d163-fdf9-4256-98d0-88c789531f27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9171d4ec-4fc8-4e42-b12a-ec3f89080728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9171d4ec-4fc8-4e42-b12a-ec3f89080728
Content-Type: application/json

--- request body ---
{"handle":"qa-e34b22e410f7","displayName":"QA e34b22e410f7","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9171d4ec-4fc8-4e42-b12a-ec3f89080728
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-e34b22e410f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b025b8e-aeb1-4fde-9f7a-c2b7d9ddd087","handle":"qa-e34b22e410f7","displayName":"QA e34b22e410f7","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.696136076Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-466e5797-e48e-4391-a81d-ba6793fceff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466e5797-e48e-4391-a81d-ba6793fceff1
Content-Type: application/json

--- request body ---
{"handle":"qa-4656905f44f7","displayName":"QA 4656905f44f7","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-466e5797-e48e-4391-a81d-ba6793fceff1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-4656905f44f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e9c923a-60ba-4470-9a29-987e59cb1993","handle":"qa-4656905f44f7","displayName":"QA 4656905f44f7","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.753248661Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-219e8419-30b5-472c-a451-1877263ff6f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219e8419-30b5-472c-a451-1877263ff6f7
Content-Type: application/json

--- request body ---
{"handle":"qa-e34b22e410f7","password":"****"}

--- response: 200 in 61 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-219e8419-30b5-472c-a451-1877263ff6f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b025b8e-aeb1-4fde-9f7a-c2b7d9ddd087"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e0a6f774-7261-42d5-bd60-41d517559f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0a6f774-7261-42d5-bd60-41d517559f06
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4656905f44f7","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0a6f774-7261-42d5-bd60-41d517559f06
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
Location: /v1/conversations/cnv_1a5058d2-b4ce-4651-abdf-5ff750f426b9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a5058d2-b4ce-4651-abdf-5ff750f426b9","subject":"Error contract","status":"open","region":"eu","participants":["qa-e34b22e410f7","qa-4656905f44f7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.861222843Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-7babfab1-48f1-4330-8356-89f2f87ed0b4

--- request headers ---
Accept: application/json
X-Fault-Key: 75c6e0da-2210-4b0b-ac50-c2f77ec09171
X-Fault: unavailable-once
X-Correlation-Id: qa-7babfab1-48f1-4330-8356-89f2f87ed0b4
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7babfab1-48f1-4330-8356-89f2f87ed0b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-7babfab1-48f1-4330-8356-89f2f87ed0b4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02a69bd1-eae4-43ab-9679-6a5dbd8e2417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02a69bd1-eae4-43ab-9679-6a5dbd8e2417
Content-Type: application/json

--- request body ---
{"handle":"qa-4656905f44f7","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-02a69bd1-eae4-43ab-9679-6a5dbd8e2417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e9c923a-60ba-4470-9a29-987e59cb1993"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce425032-d576-4d4c-a640-a6dfbd5415fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce425032-d576-4d4c-a640-a6dfbd5415fd
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce425032-d576-4d4c-a640-a6dfbd5415fd
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
correlation: qa-2897bef1-4ecc-49d8-8fc3-85b4dae6c11c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2897bef1-4ecc-49d8-8fc3-85b4dae6c11c
Content-Type: application/json

--- request body ---
{"handle":"qa-4656905f44f7","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2897bef1-4ecc-49d8-8fc3-85b4dae6c11c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2897bef1-4ecc-49d8-8fc3-85b4dae6c11c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73e3203a-fdcc-4687-acc4-a40896880b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73e3203a-fdcc-4687-acc4-a40896880b61
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73e3203a-fdcc-4687-acc4-a40896880b61
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
correlation: qa-6f82d163-fdf9-4256-98d0-88c789531f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f82d163-fdf9-4256-98d0-88c789531f27
Content-Type: application/json

--- request body ---
{"handle":"qa-e34b22e410f7","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f82d163-fdf9-4256-98d0-88c789531f27
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f82d163-fdf9-4256-98d0-88c789531f27"}
```
