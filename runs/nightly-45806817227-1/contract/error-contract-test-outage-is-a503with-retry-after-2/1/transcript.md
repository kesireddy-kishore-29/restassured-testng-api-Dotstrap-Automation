# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 67 | `qa-49043649-7008-481b-8ef1-acdbf8373002` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-a3bdeacc-305c-422b-a393-ccd5ea5bcc88` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-efc30526-631f-4c4c-a520-5334fba15d3e` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-f82c910d-8f21-4d60-8ec1-b8c2722067c8` |
| 5 | `GET /v1/accounts/me` | 503 | 20 | `qa-c1b1ae2b-4f70-4146-b9a0-a1f5332f233c` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-cc582c01-c706-4aae-82dd-c473c98a4b4b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-03afc87d-c2c9-441b-bdac-defb55067948` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-19bc5e98-f4a8-4c50-92b6-0b999f7b47bb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-d32be935-9027-42d1-b3a1-9d7440f6b434` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-331a9224-b3b5-4546-a4d6-f8344ed4e7e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49043649-7008-481b-8ef1-acdbf8373002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49043649-7008-481b-8ef1-acdbf8373002
Content-Type: application/json

--- request body ---
{"handle":"qa-a1e415a276cd","displayName":"QA a1e415a276cd","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-49043649-7008-481b-8ef1-acdbf8373002
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-a1e415a276cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f671f861-7015-47b8-b64a-835718b6eda6","handle":"qa-a1e415a276cd","displayName":"QA a1e415a276cd","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.621631138Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a3bdeacc-305c-422b-a393-ccd5ea5bcc88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3bdeacc-305c-422b-a393-ccd5ea5bcc88
Content-Type: application/json

--- request body ---
{"handle":"qa-dc49cdba729e","displayName":"QA dc49cdba729e","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3bdeacc-305c-422b-a393-ccd5ea5bcc88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-dc49cdba729e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f19b6af3-6f4e-4263-95a2-b73f0b69ec5a","handle":"qa-dc49cdba729e","displayName":"QA dc49cdba729e","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.691896085Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-efc30526-631f-4c4c-a520-5334fba15d3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efc30526-631f-4c4c-a520-5334fba15d3e
Content-Type: application/json

--- request body ---
{"handle":"qa-a1e415a276cd","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-efc30526-631f-4c4c-a520-5334fba15d3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f671f861-7015-47b8-b64a-835718b6eda6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f82c910d-8f21-4d60-8ec1-b8c2722067c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f82c910d-8f21-4d60-8ec1-b8c2722067c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dc49cdba729e","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f82c910d-8f21-4d60-8ec1-b8c2722067c8
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
Location: /v1/conversations/cnv_7409fc40-21ba-4ac6-9b66-ec838e0f0e36
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7409fc40-21ba-4ac6-9b66-ec838e0f0e36","subject":"Error contract","status":"open","region":"eu","participants":["qa-a1e415a276cd","qa-dc49cdba729e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.791040385Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c1b1ae2b-4f70-4146-b9a0-a1f5332f233c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 80d4ce6e-963a-41d8-86c4-19fce85dd504
X-Correlation-Id: qa-c1b1ae2b-4f70-4146-b9a0-a1f5332f233c
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1b1ae2b-4f70-4146-b9a0-a1f5332f233c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c1b1ae2b-4f70-4146-b9a0-a1f5332f233c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cc582c01-c706-4aae-82dd-c473c98a4b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc582c01-c706-4aae-82dd-c473c98a4b4b
Content-Type: application/json

--- request body ---
{"handle":"qa-dc49cdba729e","password":"****"}

--- response: 200 in 55 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc582c01-c706-4aae-82dd-c473c98a4b4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f19b6af3-6f4e-4263-95a2-b73f0b69ec5a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03afc87d-c2c9-441b-bdac-defb55067948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03afc87d-c2c9-441b-bdac-defb55067948
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03afc87d-c2c9-441b-bdac-defb55067948
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
correlation: qa-19bc5e98-f4a8-4c50-92b6-0b999f7b47bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19bc5e98-f4a8-4c50-92b6-0b999f7b47bb
Content-Type: application/json

--- request body ---
{"handle":"qa-dc49cdba729e","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19bc5e98-f4a8-4c50-92b6-0b999f7b47bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19bc5e98-f4a8-4c50-92b6-0b999f7b47bb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d32be935-9027-42d1-b3a1-9d7440f6b434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d32be935-9027-42d1-b3a1-9d7440f6b434
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d32be935-9027-42d1-b3a1-9d7440f6b434
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
correlation: qa-331a9224-b3b5-4546-a4d6-f8344ed4e7e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-331a9224-b3b5-4546-a4d6-f8344ed4e7e5
Content-Type: application/json

--- request body ---
{"handle":"qa-a1e415a276cd","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-331a9224-b3b5-4546-a4d6-f8344ed4e7e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-331a9224-b3b5-4546-a4d6-f8344ed4e7e5"}
```
