# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-c564c681-258f-4091-9168-6df513b247be` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-1efc0cd4-4fc5-4be7-a2b0-09438c88a664` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-9358a95d-b56d-4a03-b1a2-72d6bb5e82f8` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-bd7c0f05-203e-4efc-955b-c8cd93e2f941` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 26 | `qa-63c49b8b-2168-44e0-9e9c-33da34eeb7dc` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-6554f238-e59d-441f-b229-6b2ae4e2170b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2b262fd8-3b98-4d98-90aa-ce19fcc2b4e9` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-c5b2b23e-39f8-44d7-b703-0da4b247e652` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2a3cf45f-bdf4-48ce-bf77-c97839acb102` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-1305c227-4162-47b4-96b0-d9d040fec81b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c564c681-258f-4091-9168-6df513b247be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c564c681-258f-4091-9168-6df513b247be
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b9a754e0a4","displayName":"QA f8b9a754e0a4","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c564c681-258f-4091-9168-6df513b247be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Location: /v1/accounts/qa-f8b9a754e0a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee33d67c-98ef-4c49-8b8c-fb274359e8e8","handle":"qa-f8b9a754e0a4","displayName":"QA f8b9a754e0a4","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.483160764Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1efc0cd4-4fc5-4be7-a2b0-09438c88a664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1efc0cd4-4fc5-4be7-a2b0-09438c88a664
Content-Type: application/json

--- request body ---
{"handle":"qa-2ddb61dc5913","displayName":"QA 2ddb61dc5913","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1efc0cd4-4fc5-4be7-a2b0-09438c88a664
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Location: /v1/accounts/qa-2ddb61dc5913
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f4d7529-8a82-4da8-b842-5a77f1c765af","handle":"qa-2ddb61dc5913","displayName":"QA 2ddb61dc5913","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.554212276Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9358a95d-b56d-4a03-b1a2-72d6bb5e82f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9358a95d-b56d-4a03-b1a2-72d6bb5e82f8
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b9a754e0a4","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9358a95d-b56d-4a03-b1a2-72d6bb5e82f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee33d67c-98ef-4c49-8b8c-fb274359e8e8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bd7c0f05-203e-4efc-955b-c8cd93e2f941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd7c0f05-203e-4efc-955b-c8cd93e2f941
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2ddb61dc5913","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd7c0f05-203e-4efc-955b-c8cd93e2f941
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
Location: /v1/conversations/cnv_2eb0de60-7662-42a4-8ea8-4828219dc539
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2eb0de60-7662-42a4-8ea8-4828219dc539","subject":"Error contract","status":"open","region":"eu","participants":["qa-f8b9a754e0a4","qa-2ddb61dc5913"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.654060458Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2eb0de60-7662-42a4-8ea8-4828219dc539/messages
correlation: qa-63c49b8b-2168-44e0-9e9c-33da34eeb7dc

--- request headers ---
Accept: application/json
X-Fault-Key: c84ec869-3cd1-4d4e-8dd1-d2cfd8670c3a
X-Fault: unavailable-once
X-Correlation-Id: qa-63c49b8b-2168-44e0-9e9c-33da34eeb7dc
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63c49b8b-2168-44e0-9e9c-33da34eeb7dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2eb0de60-7662-42a4-8ea8-4828219dc539/messages","correlationId":"qa-63c49b8b-2168-44e0-9e9c-33da34eeb7dc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6554f238-e59d-441f-b229-6b2ae4e2170b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6554f238-e59d-441f-b229-6b2ae4e2170b
Content-Type: application/json

--- request body ---
{"handle":"qa-2ddb61dc5913","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6554f238-e59d-441f-b229-6b2ae4e2170b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f4d7529-8a82-4da8-b842-5a77f1c765af"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b262fd8-3b98-4d98-90aa-ce19fcc2b4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b262fd8-3b98-4d98-90aa-ce19fcc2b4e9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b262fd8-3b98-4d98-90aa-ce19fcc2b4e9
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
correlation: qa-c5b2b23e-39f8-44d7-b703-0da4b247e652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5b2b23e-39f8-44d7-b703-0da4b247e652
Content-Type: application/json

--- request body ---
{"handle":"qa-2ddb61dc5913","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5b2b23e-39f8-44d7-b703-0da4b247e652
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5b2b23e-39f8-44d7-b703-0da4b247e652"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a3cf45f-bdf4-48ce-bf77-c97839acb102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a3cf45f-bdf4-48ce-bf77-c97839acb102
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a3cf45f-bdf4-48ce-bf77-c97839acb102
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
correlation: qa-1305c227-4162-47b4-96b0-d9d040fec81b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1305c227-4162-47b4-96b0-d9d040fec81b
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b9a754e0a4","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1305c227-4162-47b4-96b0-d9d040fec81b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1305c227-4162-47b4-96b0-d9d040fec81b"}
```
