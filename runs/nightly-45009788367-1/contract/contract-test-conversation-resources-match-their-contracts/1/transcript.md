# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 269 | `qa-0454a9d0-a4c6-4295-ad07-5af8d8cf4748` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-e1f308f8-d40a-4cd5-b980-cba85c18db56` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-1b4ca2cd-38b8-43f3-a9f6-10df07d66cba` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-bb28577a-d2bd-4e7a-a41a-d873c45cb419` |
| 5 | `GET /v1/conversations` | 200 | 23 | `qa-814256e5-d180-4551-a42c-98bad6f2b7a4` |
| 6 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-194adc45-ae4e-43e2-bb81-af783c8f7557` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-f6400d17-2852-4dad-93ef-d2bc91b141e2` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-8a69c3f0-b8f8-4318-a59b-92d5db7f5857` |
| 9 | `POST /v1/auth/token` | 200 | 8 | `qa-825d4b08-7014-4b43-a318-eeba6417bb87` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 6 | `qa-b992482d-bb5e-4df9-9673-fcd29fa2f654` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-e91b961e-816a-4dd3-ad40-dea8f42b418e` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-c3682fdf-32d8-490d-9458-e3e968c791ad` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-81b9b7c5-29b9-44ab-bea1-6de4b0120974` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-c2ffd2cc-bab7-4490-ae45-8a435f5f58cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0454a9d0-a4c6-4295-ad07-5af8d8cf4748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0454a9d0-a4c6-4295-ad07-5af8d8cf4748
Content-Type: application/json

--- request body ---
{"handle":"qa-f9507287759b","displayName":"QA f9507287759b","password":"****","region":"eu"}

--- response: 201 in 269 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-0454a9d0-a4c6-4295-ad07-5af8d8cf4748
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-f9507287759b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9acde58c-0ba5-4350-9d1a-992b2c95f076","handle":"qa-f9507287759b","displayName":"QA f9507287759b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:39.590030037Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1f308f8-d40a-4cd5-b980-cba85c18db56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1f308f8-d40a-4cd5-b980-cba85c18db56
Content-Type: application/json

--- request body ---
{"handle":"qa-ac29ea3ceff6","displayName":"QA ac29ea3ceff6","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1f308f8-d40a-4cd5-b980-cba85c18db56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-ac29ea3ceff6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42322df4-bec6-4b5f-942f-169ef50eabf8","handle":"qa-ac29ea3ceff6","displayName":"QA ac29ea3ceff6","region":"eu","role":"user","createdAt":"2026-11-22T09:54:39.895297373Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1b4ca2cd-38b8-43f3-a9f6-10df07d66cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b4ca2cd-38b8-43f3-a9f6-10df07d66cba
Content-Type: application/json

--- request body ---
{"handle":"qa-f9507287759b","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b4ca2cd-38b8-43f3-a9f6-10df07d66cba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9acde58c-0ba5-4350-9d1a-992b2c95f076"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb28577a-d2bd-4e7a-a41a-d873c45cb419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb28577a-d2bd-4e7a-a41a-d873c45cb419
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ac29ea3ceff6","subject":"Contract check","message":"Hello"}

--- response: 201 in 65 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb28577a-d2bd-4e7a-a41a-d873c45cb419
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
Location: /v1/conversations/cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","subject":"Contract check","status":"open","region":"eu","participants":["qa-f9507287759b","qa-ac29ea3ceff6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.022248791Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-814256e5-d180-4551-a42c-98bad6f2b7a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-814256e5-d180-4551-a42c-98bad6f2b7a4
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-814256e5-d180-4551-a42c-98bad6f2b7a4
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
Content-Length: 259

{"items":[{"id":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","subject":"Contract check","status":"open","region":"eu","participants":["qa-f9507287759b","qa-ac29ea3ceff6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.022248791Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7
correlation: qa-194adc45-ae4e-43e2-bb81-af783c8f7557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194adc45-ae4e-43e2-bb81-af783c8f7557
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-194adc45-ae4e-43e2-bb81-af783c8f7557
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","subject":"Contract check","status":"open","region":"eu","participants":["qa-f9507287759b","qa-ac29ea3ceff6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.022248791Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7/messages
correlation: qa-f6400d17-2852-4dad-93ef-d2bc91b141e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6400d17-2852-4dad-93ef-d2bc91b141e2
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6400d17-2852-4dad-93ef-d2bc91b141e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_8af559dd-ade1-4e01-b60d-0f7d3bcc59ee","conversationId":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","sender":"qa-f9507287759b","body":"Second","createdAt":"2026-11-22T09:54:40.152863412Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7/messages
correlation: qa-8a69c3f0-b8f8-4318-a59b-92d5db7f5857

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a69c3f0-b8f8-4318-a59b-92d5db7f5857
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a69c3f0-b8f8-4318-a59b-92d5db7f5857
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_71472f17-c6a2-4a1b-89de-c0d65527996a","conversationId":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","sender":"qa-f9507287759b","body":"Hello","createdAt":"2026-11-22T09:54:40.022407030Z"},{"id":"msg_8af559dd-ade1-4e01-b60d-0f7d3bcc59ee","conversationId":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","sender":"qa-f9507287759b","body":"Second","createdAt":"2026-11-22T09:54:40.152863412Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-825d4b08-7014-4b43-a318-eeba6417bb87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-825d4b08-7014-4b43-a318-eeba6417bb87
Content-Type: application/json

--- request body ---
{"handle":"qa-ac29ea3ceff6","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-825d4b08-7014-4b43-a318-eeba6417bb87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42322df4-bec6-4b5f-942f-169ef50eabf8"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7/read
correlation: qa-b992482d-bb5e-4df9-9673-fcd29fa2f654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b992482d-bb5e-4df9-9673-fcd29fa2f654
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b992482d-bb5e-4df9-9673-fcd29fa2f654
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
Content-Length: 77

{"conversationId":"cnv_0e10eb29-5b03-4e95-b7be-c7a82a424bb7","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e91b961e-816a-4dd3-ad40-dea8f42b418e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e91b961e-816a-4dd3-ad40-dea8f42b418e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e91b961e-816a-4dd3-ad40-dea8f42b418e
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-c3682fdf-32d8-490d-9458-e3e968c791ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3682fdf-32d8-490d-9458-e3e968c791ad
Content-Type: application/json

--- request body ---
{"handle":"qa-ac29ea3ceff6","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3682fdf-32d8-490d-9458-e3e968c791ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3682fdf-32d8-490d-9458-e3e968c791ad"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81b9b7c5-29b9-44ab-bea1-6de4b0120974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b9b7c5-29b9-44ab-bea1-6de4b0120974
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81b9b7c5-29b9-44ab-bea1-6de4b0120974
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c2ffd2cc-bab7-4490-ae45-8a435f5f58cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ffd2cc-bab7-4490-ae45-8a435f5f58cc
Content-Type: application/json

--- request body ---
{"handle":"qa-f9507287759b","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2ffd2cc-bab7-4490-ae45-8a435f5f58cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2ffd2cc-bab7-4490-ae45-8a435f5f58cc"}
```
