# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 441 | `qa-ff2bb4c9-e32f-4446-9b91-1d9e51dc038a` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-a5aa6c45-2e55-4206-8dbf-03db9376ddcc` |
| 3 | `POST /v1/auth/token` | 200 | 65 | `qa-434841da-0ef9-419e-9d88-479b2c469c45` |
| 4 | `POST /v1/conversations` | 201 | 63 | `qa-c0e4397d-6c2f-4eb7-ae16-18a37170d5a4` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 40 | `qa-7cc72bfd-5843-4ef4-b7fe-985fd8c15b37` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-cf72f620-a845-4cb7-ac10-44ff7cc5baca` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-0b777d0a-c52a-414f-9358-40a9aea8f30c` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-d246cbf2-9fcf-45e0-959b-7bdcfde90eaa` |
| 9 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-d911ab8c-0954-4eed-ad1b-c6f2f364106c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b9bbdb5c-01c8-460c-be9a-114fee5c7730` |
| 11 | `POST /v1/auth/token` | 401 | 15 | `qa-52710151-4bb5-4644-80b4-57b333553982` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-fc03b949-e586-4bae-a3ab-06146deca7ed` |
| 13 | `POST /v1/auth/token` | 401 | 15 | `qa-94068619-c53f-463b-8d81-ad77f9431b83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ff2bb4c9-e32f-4446-9b91-1d9e51dc038a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff2bb4c9-e32f-4446-9b91-1d9e51dc038a
Content-Type: application/json

--- request body ---
{"handle":"qa-994074960fa8","displayName":"QA 994074960fa8","password":"****","region":"eu"}

--- response: 201 in 441 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff2bb4c9-e32f-4446-9b91-1d9e51dc038a
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
Location: /v1/accounts/qa-994074960fa8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69738c82-7e34-499e-81d6-fac7abcbccc2","handle":"qa-994074960fa8","displayName":"QA 994074960fa8","region":"eu","role":"user","createdAt":"2026-10-27T08:00:29.793281084Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a5aa6c45-2e55-4206-8dbf-03db9376ddcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5aa6c45-2e55-4206-8dbf-03db9376ddcc
Content-Type: application/json

--- request body ---
{"handle":"qa-53db328a245d","displayName":"QA 53db328a245d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5aa6c45-2e55-4206-8dbf-03db9376ddcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-53db328a245d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_737d2568-9470-4553-9cec-5824fa5d7f8e","handle":"qa-53db328a245d","displayName":"QA 53db328a245d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.231765625Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-434841da-0ef9-419e-9d88-479b2c469c45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-434841da-0ef9-419e-9d88-479b2c469c45
Content-Type: application/json

--- request body ---
{"handle":"qa-994074960fa8","password":"****"}

--- response: 200 in 65 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-434841da-0ef9-419e-9d88-479b2c469c45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69738c82-7e34-499e-81d6-fac7abcbccc2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c0e4397d-6c2f-4eb7-ae16-18a37170d5a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0e4397d-6c2f-4eb7-ae16-18a37170d5a4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-53db328a245d","subject":"Updates","message":"First"}

--- response: 201 in 63 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0e4397d-6c2f-4eb7-ae16-18a37170d5a4
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
Location: /v1/conversations/cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f","subject":"Updates","status":"open","region":"eu","participants":["qa-994074960fa8","qa-53db328a245d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:30.424359677Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f/messages
correlation: qa-7cc72bfd-5843-4ef4-b7fe-985fd8c15b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cc72bfd-5843-4ef4-b7fe-985fd8c15b37
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cc72bfd-5843-4ef4-b7fe-985fd8c15b37
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
Content-Length: 197

{"id":"msg_4c189d59-8b36-45d2-af06-6db372c42443","conversationId":"cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f","sender":"qa-994074960fa8","body":"Second","createdAt":"2026-10-27T08:00:30.590864617Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cf72f620-a845-4cb7-ac10-44ff7cc5baca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf72f620-a845-4cb7-ac10-44ff7cc5baca
Content-Type: application/json

--- request body ---
{"handle":"qa-53db328a245d","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf72f620-a845-4cb7-ac10-44ff7cc5baca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_737d2568-9470-4553-9cec-5824fa5d7f8e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f
correlation: qa-0b777d0a-c52a-414f-9358-40a9aea8f30c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b777d0a-c52a-414f-9358-40a9aea8f30c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b777d0a-c52a-414f-9358-40a9aea8f30c
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f","subject":"Updates","status":"open","region":"eu","participants":["qa-994074960fa8","qa-53db328a245d"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-27T08:00:30.424359677Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f/read
correlation: qa-d246cbf2-9fcf-45e0-959b-7bdcfde90eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d246cbf2-9fcf-45e0-959b-7bdcfde90eaa
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d246cbf2-9fcf-45e0-959b-7bdcfde90eaa
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
Content-Length: 77

{"conversationId":"cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f
correlation: qa-d911ab8c-0954-4eed-ad1b-c6f2f364106c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d911ab8c-0954-4eed-ad1b-c6f2f364106c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d911ab8c-0954-4eed-ad1b-c6f2f364106c
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
Content-Length: 230

{"id":"cnv_ecef4590-39ca-493a-bb1a-8da843b4e49f","subject":"Updates","status":"open","region":"eu","participants":["qa-994074960fa8","qa-53db328a245d"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-27T08:00:30.424359677Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9bbdb5c-01c8-460c-be9a-114fee5c7730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9bbdb5c-01c8-460c-be9a-114fee5c7730
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9bbdb5c-01c8-460c-be9a-114fee5c7730
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-52710151-4bb5-4644-80b4-57b333553982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52710151-4bb5-4644-80b4-57b333553982
Content-Type: application/json

--- request body ---
{"handle":"qa-53db328a245d","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52710151-4bb5-4644-80b4-57b333553982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52710151-4bb5-4644-80b4-57b333553982"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc03b949-e586-4bae-a3ab-06146deca7ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc03b949-e586-4bae-a3ab-06146deca7ed
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc03b949-e586-4bae-a3ab-06146deca7ed
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-94068619-c53f-463b-8d81-ad77f9431b83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94068619-c53f-463b-8d81-ad77f9431b83
Content-Type: application/json

--- request body ---
{"handle":"qa-994074960fa8","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94068619-c53f-463b-8d81-ad77f9431b83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94068619-c53f-463b-8d81-ad77f9431b83"}
```
