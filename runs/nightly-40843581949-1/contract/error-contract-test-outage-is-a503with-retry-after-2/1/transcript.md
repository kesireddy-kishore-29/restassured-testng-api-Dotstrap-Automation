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
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-8c76f78a-07f2-434e-8011-73bccaaf1cd9` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-7308a1bd-c7c3-4b60-bb12-5d7cfe6746a7` |
| 3 | `POST /v1/auth/token` | 200 | 110 | `qa-37e0c1cc-568e-4778-a21f-4389f5f3c4a4` |
| 4 | `POST /v1/conversations` | 201 | 69 | `qa-29af5de3-d6fb-4717-a5c1-70f037fb266d` |
| 5 | `GET /v1/accounts/me` | 503 | 33 | `qa-e56f92d8-afe7-428f-b2f0-f4370c3c0f34` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-0ec4b2a4-1e8c-419a-b3fc-76fa00fc9daa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-169d5030-5e7f-40c9-bd24-3fcbd9f95516` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-d07478dd-3b5b-4601-800c-3b2d33dae07c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-d93a61c2-ba76-4499-b398-a8a9b063d4ec` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-f1ea97c3-40f1-40f1-a26f-594156e56b81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c76f78a-07f2-434e-8011-73bccaaf1cd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c76f78a-07f2-434e-8011-73bccaaf1cd9
Content-Type: application/json

--- request body ---
{"handle":"qa-ebd540692d3c","displayName":"QA ebd540692d3c","password":"****","region":"eu"}

--- response: 201 in 501 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c76f78a-07f2-434e-8011-73bccaaf1cd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-ebd540692d3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fe43cbf-7079-4b60-8fb2-aca22033ef0a","handle":"qa-ebd540692d3c","displayName":"QA ebd540692d3c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.644746531Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7308a1bd-c7c3-4b60-bb12-5d7cfe6746a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7308a1bd-c7c3-4b60-bb12-5d7cfe6746a7
Content-Type: application/json

--- request body ---
{"handle":"qa-39bbf73671db","displayName":"QA 39bbf73671db","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7308a1bd-c7c3-4b60-bb12-5d7cfe6746a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-39bbf73671db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db64b792-6589-4bec-8d11-e06690ea8976","handle":"qa-39bbf73671db","displayName":"QA 39bbf73671db","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.127302526Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-37e0c1cc-568e-4778-a21f-4389f5f3c4a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e0c1cc-568e-4778-a21f-4389f5f3c4a4
Content-Type: application/json

--- request body ---
{"handle":"qa-ebd540692d3c","password":"****"}

--- response: 200 in 110 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-37e0c1cc-568e-4778-a21f-4389f5f3c4a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fe43cbf-7079-4b60-8fb2-aca22033ef0a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-29af5de3-d6fb-4717-a5c1-70f037fb266d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29af5de3-d6fb-4717-a5c1-70f037fb266d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-39bbf73671db","subject":"Error contract","message":"Hi"}

--- response: 201 in 69 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-29af5de3-d6fb-4717-a5c1-70f037fb266d
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
Location: /v1/conversations/cnv_0ace774c-0355-4183-bac5-48b9c33df608
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0ace774c-0355-4183-bac5-48b9c33df608","subject":"Error contract","status":"open","region":"eu","participants":["qa-ebd540692d3c","qa-39bbf73671db"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.466484334Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e56f92d8-afe7-428f-b2f0-f4370c3c0f34

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d2671ade-62a7-45b1-8b88-0a43bc19c9d2
X-Correlation-Id: qa-e56f92d8-afe7-428f-b2f0-f4370c3c0f34
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e56f92d8-afe7-428f-b2f0-f4370c3c0f34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e56f92d8-afe7-428f-b2f0-f4370c3c0f34"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ec4b2a4-1e8c-419a-b3fc-76fa00fc9daa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec4b2a4-1e8c-419a-b3fc-76fa00fc9daa
Content-Type: application/json

--- request body ---
{"handle":"qa-39bbf73671db","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ec4b2a4-1e8c-419a-b3fc-76fa00fc9daa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db64b792-6589-4bec-8d11-e06690ea8976"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-169d5030-5e7f-40c9-bd24-3fcbd9f95516

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-169d5030-5e7f-40c9-bd24-3fcbd9f95516
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-169d5030-5e7f-40c9-bd24-3fcbd9f95516
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
correlation: qa-d07478dd-3b5b-4601-800c-3b2d33dae07c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d07478dd-3b5b-4601-800c-3b2d33dae07c
Content-Type: application/json

--- request body ---
{"handle":"qa-39bbf73671db","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d07478dd-3b5b-4601-800c-3b2d33dae07c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d07478dd-3b5b-4601-800c-3b2d33dae07c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d93a61c2-ba76-4499-b398-a8a9b063d4ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d93a61c2-ba76-4499-b398-a8a9b063d4ec
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d93a61c2-ba76-4499-b398-a8a9b063d4ec
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
correlation: qa-f1ea97c3-40f1-40f1-a26f-594156e56b81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1ea97c3-40f1-40f1-a26f-594156e56b81
Content-Type: application/json

--- request body ---
{"handle":"qa-ebd540692d3c","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1ea97c3-40f1-40f1-a26f-594156e56b81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1ea97c3-40f1-40f1-a26f-594156e56b81"}
```
