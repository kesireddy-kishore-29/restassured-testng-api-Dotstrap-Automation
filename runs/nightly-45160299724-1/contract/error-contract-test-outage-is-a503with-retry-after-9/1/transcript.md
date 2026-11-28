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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-b544d39a-9021-45e8-8d26-af0078b7a0d9` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-8be36f31-4c87-46c7-80ab-2fc572f8f9ec` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-87f6ec5d-bce6-4495-90a4-777e3b75f65a` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-5f8f579b-eb44-4644-aaee-d0e51859bcc8` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 19 | `qa-f4d8ec64-bd43-4476-b530-542a04351863` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-e4c50d8d-ac79-49e0-88ee-5b4635a29202` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-62063570-3628-476a-9d13-634b7f3a2041` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-f55e8ed7-9d66-40c8-aac3-0a061476135e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-0e668fb3-6110-481e-8997-99bc074ac1c3` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-77229d60-fe07-4c7e-877b-a2c06f83cb5a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b544d39a-9021-45e8-8d26-af0078b7a0d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b544d39a-9021-45e8-8d26-af0078b7a0d9
Content-Type: application/json

--- request body ---
{"handle":"qa-10160349e8b1","displayName":"QA 10160349e8b1","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b544d39a-9021-45e8-8d26-af0078b7a0d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-10160349e8b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_497b34a3-b953-4a8a-8c5e-6e9f895958e2","handle":"qa-10160349e8b1","displayName":"QA 10160349e8b1","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.350498598Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8be36f31-4c87-46c7-80ab-2fc572f8f9ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8be36f31-4c87-46c7-80ab-2fc572f8f9ec
Content-Type: application/json

--- request body ---
{"handle":"qa-ca6e7da585de","displayName":"QA ca6e7da585de","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8be36f31-4c87-46c7-80ab-2fc572f8f9ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-ca6e7da585de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3fa8482c-e514-4821-8164-139bd2b36844","handle":"qa-ca6e7da585de","displayName":"QA ca6e7da585de","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.397667827Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-87f6ec5d-bce6-4495-90a4-777e3b75f65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87f6ec5d-bce6-4495-90a4-777e3b75f65a
Content-Type: application/json

--- request body ---
{"handle":"qa-10160349e8b1","password":"****"}

--- response: 200 in 60 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-87f6ec5d-bce6-4495-90a4-777e3b75f65a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_497b34a3-b953-4a8a-8c5e-6e9f895958e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5f8f579b-eb44-4644-aaee-d0e51859bcc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f8f579b-eb44-4644-aaee-d0e51859bcc8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ca6e7da585de","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f8f579b-eb44-4644-aaee-d0e51859bcc8
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
Location: /v1/conversations/cnv_f391a823-c1fa-4ce9-a055-431374f42089
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f391a823-c1fa-4ce9-a055-431374f42089","subject":"Error contract","status":"open","region":"eu","participants":["qa-10160349e8b1","qa-ca6e7da585de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.519457973Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_f391a823-c1fa-4ce9-a055-431374f42089/messages
correlation: qa-f4d8ec64-bd43-4476-b530-542a04351863

--- request headers ---
Accept: application/json
X-Fault-Key: b767fd93-0042-4317-9f1a-48638f173851
X-Fault: unavailable-once
X-Correlation-Id: qa-f4d8ec64-bd43-4476-b530-542a04351863
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4d8ec64-bd43-4476-b530-542a04351863
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_f391a823-c1fa-4ce9-a055-431374f42089/messages","correlationId":"qa-f4d8ec64-bd43-4476-b530-542a04351863"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e4c50d8d-ac79-49e0-88ee-5b4635a29202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c50d8d-ac79-49e0-88ee-5b4635a29202
Content-Type: application/json

--- request body ---
{"handle":"qa-ca6e7da585de","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4c50d8d-ac79-49e0-88ee-5b4635a29202
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3fa8482c-e514-4821-8164-139bd2b36844"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62063570-3628-476a-9d13-634b7f3a2041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62063570-3628-476a-9d13-634b7f3a2041
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62063570-3628-476a-9d13-634b7f3a2041
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
correlation: qa-f55e8ed7-9d66-40c8-aac3-0a061476135e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f55e8ed7-9d66-40c8-aac3-0a061476135e
Content-Type: application/json

--- request body ---
{"handle":"qa-ca6e7da585de","password":"****"}

--- response: 401 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f55e8ed7-9d66-40c8-aac3-0a061476135e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f55e8ed7-9d66-40c8-aac3-0a061476135e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e668fb3-6110-481e-8997-99bc074ac1c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e668fb3-6110-481e-8997-99bc074ac1c3
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e668fb3-6110-481e-8997-99bc074ac1c3
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
correlation: qa-77229d60-fe07-4c7e-877b-a2c06f83cb5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77229d60-fe07-4c7e-877b-a2c06f83cb5a
Content-Type: application/json

--- request body ---
{"handle":"qa-10160349e8b1","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77229d60-fe07-4c7e-877b-a2c06f83cb5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77229d60-fe07-4c7e-877b-a2c06f83cb5a"}
```
