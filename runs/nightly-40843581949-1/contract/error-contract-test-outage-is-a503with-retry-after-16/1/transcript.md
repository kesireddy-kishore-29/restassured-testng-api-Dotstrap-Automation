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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-75823caf-f6a6-415d-be4d-a4787d56ab79` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-a19a0354-1fdc-4f5f-bfbe-4bea6b939b52` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-63c4f8ab-8076-4fbc-b3be-6ce80a5c8763` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-65d055a9-ea59-4618-a280-5847c8b2ddd0` |
| 5 | `GET /v1/admin/stats` | 503 | 19 | `qa-dcd5f9e5-2efb-4b9d-9e9c-58b2aead80c7` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-49787e1b-c953-4757-9edb-f19526c62c40` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b753c84d-23e8-40b3-88e7-5c71df90dbb0` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-3db28455-c4d2-4642-8b2e-e8bc24e35628` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f3f2bd86-20ba-4603-90ef-feb12a611911` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-84690967-9cb9-4219-9c0d-a40140e6a296` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75823caf-f6a6-415d-be4d-a4787d56ab79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75823caf-f6a6-415d-be4d-a4787d56ab79
Content-Type: application/json

--- request body ---
{"handle":"qa-e0f5dbea9014","displayName":"QA e0f5dbea9014","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-75823caf-f6a6-415d-be4d-a4787d56ab79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-e0f5dbea9014
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4cc3461-3b68-43d6-b3d1-95a64b9eec5d","handle":"qa-e0f5dbea9014","displayName":"QA e0f5dbea9014","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.349140713Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a19a0354-1fdc-4f5f-bfbe-4bea6b939b52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a19a0354-1fdc-4f5f-bfbe-4bea6b939b52
Content-Type: application/json

--- request body ---
{"handle":"qa-7d1b20a881b6","displayName":"QA 7d1b20a881b6","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a19a0354-1fdc-4f5f-bfbe-4bea6b939b52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Location: /v1/accounts/qa-7d1b20a881b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_831f0ca0-7ae1-4eb7-9ad1-e1c04c49d81f","handle":"qa-7d1b20a881b6","displayName":"QA 7d1b20a881b6","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.414981875Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-63c4f8ab-8076-4fbc-b3be-6ce80a5c8763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63c4f8ab-8076-4fbc-b3be-6ce80a5c8763
Content-Type: application/json

--- request body ---
{"handle":"qa-e0f5dbea9014","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-63c4f8ab-8076-4fbc-b3be-6ce80a5c8763
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4cc3461-3b68-43d6-b3d1-95a64b9eec5d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65d055a9-ea59-4618-a280-5847c8b2ddd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d055a9-ea59-4618-a280-5847c8b2ddd0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7d1b20a881b6","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d055a9-ea59-4618-a280-5847c8b2ddd0
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
Location: /v1/conversations/cnv_3a056a66-c1e3-4fd7-a8f4-ed08a3dd2519
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3a056a66-c1e3-4fd7-a8f4-ed08a3dd2519","subject":"Error contract","status":"open","region":"eu","participants":["qa-e0f5dbea9014","qa-7d1b20a881b6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.478350754Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-dcd5f9e5-2efb-4b9d-9e9c-58b2aead80c7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3d7f00fd-2284-4290-9178-d698f5b3c00b
X-Correlation-Id: qa-dcd5f9e5-2efb-4b9d-9e9c-58b2aead80c7
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcd5f9e5-2efb-4b9d-9e9c-58b2aead80c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-dcd5f9e5-2efb-4b9d-9e9c-58b2aead80c7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-49787e1b-c953-4757-9edb-f19526c62c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49787e1b-c953-4757-9edb-f19526c62c40
Content-Type: application/json

--- request body ---
{"handle":"qa-7d1b20a881b6","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-49787e1b-c953-4757-9edb-f19526c62c40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_831f0ca0-7ae1-4eb7-9ad1-e1c04c49d81f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b753c84d-23e8-40b3-88e7-5c71df90dbb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b753c84d-23e8-40b3-88e7-5c71df90dbb0
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b753c84d-23e8-40b3-88e7-5c71df90dbb0
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
correlation: qa-3db28455-c4d2-4642-8b2e-e8bc24e35628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3db28455-c4d2-4642-8b2e-e8bc24e35628
Content-Type: application/json

--- request body ---
{"handle":"qa-7d1b20a881b6","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3db28455-c4d2-4642-8b2e-e8bc24e35628
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3db28455-c4d2-4642-8b2e-e8bc24e35628"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3f2bd86-20ba-4603-90ef-feb12a611911

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f2bd86-20ba-4603-90ef-feb12a611911
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3f2bd86-20ba-4603-90ef-feb12a611911
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
correlation: qa-84690967-9cb9-4219-9c0d-a40140e6a296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84690967-9cb9-4219-9c0d-a40140e6a296
Content-Type: application/json

--- request body ---
{"handle":"qa-e0f5dbea9014","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84690967-9cb9-4219-9c0d-a40140e6a296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84690967-9cb9-4219-9c0d-a40140e6a296"}
```
