# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-890aa139-584e-4c29-abf3-6fb1e713f8ab` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-b467e275-94ae-478d-b0ab-daba48233b0a` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-e7099d51-cdaa-40cc-9707-3b6b3a8497b2` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-ff29cf5e-5cfe-4e9c-8ff0-a6e12d1cb567` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-061ce22c-b4df-4909-b4a4-ae3f24ea0afd` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-f3e53642-a506-458f-a21c-0ba92c2eddfc` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 14 | `qa-624d8e13-84b7-4ac1-b474-f82dfd8a5697` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b1672c3f-4ad3-4059-995c-17f0eeb4411e` |
| 9 | `POST /v1/auth/token` | 401 | 55 | `qa-3123d058-bb49-4789-98d3-922659fa5827` |
| 10 | `POST /v1/auth/token` | 200 | 22 | `qa-b0a8447d-5ed2-476a-bc54-5322ff75e4de` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6425f4b3-e87f-40c1-b69b-868b0051572f` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-392ec170-e34e-486a-942d-0a3f9e6c165e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-c18d5cee-adc3-4392-bf1d-35fc649e37ea` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-771984eb-3a0d-41aa-88b1-0e9fd459eec0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-890aa139-584e-4c29-abf3-6fb1e713f8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-890aa139-584e-4c29-abf3-6fb1e713f8ab
Content-Type: application/json

--- request body ---
{"handle":"qa-130b0615da66","displayName":"QA 130b0615da66","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-890aa139-584e-4c29-abf3-6fb1e713f8ab
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
Location: /v1/accounts/qa-130b0615da66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ddc7b902-0d0c-4028-b33b-4b2dfef975ea","handle":"qa-130b0615da66","displayName":"QA 130b0615da66","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.595697616Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b467e275-94ae-478d-b0ab-daba48233b0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b467e275-94ae-478d-b0ab-daba48233b0a
Content-Type: application/json

--- request body ---
{"handle":"qa-a4f7686164ea","displayName":"QA a4f7686164ea","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b467e275-94ae-478d-b0ab-daba48233b0a
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
Location: /v1/accounts/qa-a4f7686164ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cfd425d-40f4-4d55-b243-5e468b16c81a","handle":"qa-a4f7686164ea","displayName":"QA a4f7686164ea","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.648344995Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e7099d51-cdaa-40cc-9707-3b6b3a8497b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7099d51-cdaa-40cc-9707-3b6b3a8497b2
Content-Type: application/json

--- request body ---
{"handle":"qa-c741243bb85c","displayName":"QA c741243bb85c","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7099d51-cdaa-40cc-9707-3b6b3a8497b2
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
Location: /v1/accounts/qa-c741243bb85c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab590c1d-6d92-4fca-86c6-cae39843455e","handle":"qa-c741243bb85c","displayName":"QA c741243bb85c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.685924112Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ff29cf5e-5cfe-4e9c-8ff0-a6e12d1cb567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff29cf5e-5cfe-4e9c-8ff0-a6e12d1cb567
Content-Type: application/json

--- request body ---
{"handle":"qa-130b0615da66","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff29cf5e-5cfe-4e9c-8ff0-a6e12d1cb567
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ddc7b902-0d0c-4028-b33b-4b2dfef975ea"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-061ce22c-b4df-4909-b4a4-ae3f24ea0afd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-061ce22c-b4df-4909-b4a4-ae3f24ea0afd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4f7686164ea","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-061ce22c-b4df-4909-b4a4-ae3f24ea0afd
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
Location: /v1/conversations/cnv_7aa9b521-19c6-42de-b244-e01fd811fb29
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7aa9b521-19c6-42de-b244-e01fd811fb29","subject":"Error contract","status":"open","region":"eu","participants":["qa-130b0615da66","qa-a4f7686164ea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.776072903Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f3e53642-a506-458f-a21c-0ba92c2eddfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3e53642-a506-458f-a21c-0ba92c2eddfc
Content-Type: application/json

--- request body ---
{"handle":"qa-c741243bb85c","password":"****"}

--- response: 200 in 53 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3e53642-a506-458f-a21c-0ba92c2eddfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab590c1d-6d92-4fca-86c6-cae39843455e"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7aa9b521-19c6-42de-b244-e01fd811fb29/close
correlation: qa-624d8e13-84b7-4ac1-b474-f82dfd8a5697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624d8e13-84b7-4ac1-b474-f82dfd8a5697
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-624d8e13-84b7-4ac1-b474-f82dfd8a5697
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7aa9b521-19c6-42de-b244-e01fd811fb29/close","correlationId":"qa-624d8e13-84b7-4ac1-b474-f82dfd8a5697"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1672c3f-4ad3-4059-995c-17f0eeb4411e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1672c3f-4ad3-4059-995c-17f0eeb4411e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1672c3f-4ad3-4059-995c-17f0eeb4411e
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3123d058-bb49-4789-98d3-922659fa5827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3123d058-bb49-4789-98d3-922659fa5827
Content-Type: application/json

--- request body ---
{"handle":"qa-c741243bb85c","password":"****"}

--- response: 401 in 55 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3123d058-bb49-4789-98d3-922659fa5827
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3123d058-bb49-4789-98d3-922659fa5827"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b0a8447d-5ed2-476a-bc54-5322ff75e4de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a8447d-5ed2-476a-bc54-5322ff75e4de
Content-Type: application/json

--- request body ---
{"handle":"qa-a4f7686164ea","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a8447d-5ed2-476a-bc54-5322ff75e4de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cfd425d-40f4-4d55-b243-5e468b16c81a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6425f4b3-e87f-40c1-b69b-868b0051572f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6425f4b3-e87f-40c1-b69b-868b0051572f
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6425f4b3-e87f-40c1-b69b-868b0051572f
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-392ec170-e34e-486a-942d-0a3f9e6c165e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-392ec170-e34e-486a-942d-0a3f9e6c165e
Content-Type: application/json

--- request body ---
{"handle":"qa-a4f7686164ea","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-392ec170-e34e-486a-942d-0a3f9e6c165e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-392ec170-e34e-486a-942d-0a3f9e6c165e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c18d5cee-adc3-4392-bf1d-35fc649e37ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c18d5cee-adc3-4392-bf1d-35fc649e37ea
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c18d5cee-adc3-4392-bf1d-35fc649e37ea
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-771984eb-3a0d-41aa-88b1-0e9fd459eec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-771984eb-3a0d-41aa-88b1-0e9fd459eec0
Content-Type: application/json

--- request body ---
{"handle":"qa-130b0615da66","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-771984eb-3a0d-41aa-88b1-0e9fd459eec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-771984eb-3a0d-41aa-88b1-0e9fd459eec0"}
```
