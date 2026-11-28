# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-49786348-e6db-499c-b090-32fedf7d53ed` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-7c80a1a5-599e-4c23-995a-b421985010fb` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-d666dfd4-27c3-4b36-a90d-a461aa26b2af` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-13f5e4ca-7314-4c87-8dee-a9e06090879a` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-9b85431c-2ff2-4bf0-a27e-ecfaea01ca6c` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-4cf7b558-71fc-48f2-8746-45df12ca98a8` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-a8d259fb-20fc-426e-a1a3-74989da55ca9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7405f677-75a3-4931-bb26-e79f976292a9` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-7e03c45e-49be-4b16-8399-ff98f513d742` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a35d8d72-4c0e-4b84-84b7-9f04cb7f338a` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-147b2ee3-14dd-4aa7-8af7-30f094d21fd3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49786348-e6db-499c-b090-32fedf7d53ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49786348-e6db-499c-b090-32fedf7d53ed
Content-Type: application/json

--- request body ---
{"handle":"qa-371d8130b599","displayName":"QA 371d8130b599","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-49786348-e6db-499c-b090-32fedf7d53ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-371d8130b599
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8680d9b1-5a52-4cd5-a9b8-224834ce60c3","handle":"qa-371d8130b599","displayName":"QA 371d8130b599","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.200796918Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7c80a1a5-599e-4c23-995a-b421985010fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c80a1a5-599e-4c23-995a-b421985010fb
Content-Type: application/json

--- request body ---
{"handle":"qa-d2731e1ad1d6","displayName":"QA d2731e1ad1d6","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c80a1a5-599e-4c23-995a-b421985010fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-d2731e1ad1d6
X-Served-Region: us
Content-Length: 181

{"id":"acc_cda43c68-e65f-4a49-b3b6-517e127f00a2","handle":"qa-d2731e1ad1d6","displayName":"QA d2731e1ad1d6","region":"us","role":"user","createdAt":"2026-11-25T11:27:58.236063463Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d666dfd4-27c3-4b36-a90d-a461aa26b2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d666dfd4-27c3-4b36-a90d-a461aa26b2af
Content-Type: application/json

--- request body ---
{"handle":"qa-371d8130b599","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d666dfd4-27c3-4b36-a90d-a461aa26b2af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8680d9b1-5a52-4cd5-a9b8-224834ce60c3"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-d2731e1ad1d6
correlation: qa-13f5e4ca-7314-4c87-8dee-a9e06090879a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13f5e4ca-7314-4c87-8dee-a9e06090879a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-13f5e4ca-7314-4c87-8dee-a9e06090879a
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
Content-Length: 74

{"handle":"qa-d2731e1ad1d6","displayName":"QA d2731e1ad1d6","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-d2731e1ad1d6
correlation: qa-9b85431c-2ff2-4bf0-a27e-ecfaea01ca6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b85431c-2ff2-4bf0-a27e-ecfaea01ca6c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b85431c-2ff2-4bf0-a27e-ecfaea01ca6c
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
Content-Length: 74

{"handle":"qa-d2731e1ad1d6","displayName":"QA d2731e1ad1d6","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-d2731e1ad1d6
correlation: qa-4cf7b558-71fc-48f2-8746-45df12ca98a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cf7b558-71fc-48f2-8746-45df12ca98a8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cf7b558-71fc-48f2-8746-45df12ca98a8
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
Content-Length: 74

{"handle":"qa-d2731e1ad1d6","displayName":"QA d2731e1ad1d6","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-a8d259fb-20fc-426e-a1a3-74989da55ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8d259fb-20fc-426e-a1a3-74989da55ca9
Content-Type: application/json

--- request body ---
{"handle":"qa-d2731e1ad1d6","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8d259fb-20fc-426e-a1a3-74989da55ca9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cda43c68-e65f-4a49-b3b6-517e127f00a2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7405f677-75a3-4931-bb26-e79f976292a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7405f677-75a3-4931-bb26-e79f976292a9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7405f677-75a3-4931-bb26-e79f976292a9
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-7e03c45e-49be-4b16-8399-ff98f513d742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e03c45e-49be-4b16-8399-ff98f513d742
Content-Type: application/json

--- request body ---
{"handle":"qa-d2731e1ad1d6","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e03c45e-49be-4b16-8399-ff98f513d742
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e03c45e-49be-4b16-8399-ff98f513d742"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a35d8d72-4c0e-4b84-84b7-9f04cb7f338a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a35d8d72-4c0e-4b84-84b7-9f04cb7f338a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a35d8d72-4c0e-4b84-84b7-9f04cb7f338a
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-147b2ee3-14dd-4aa7-8af7-30f094d21fd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-147b2ee3-14dd-4aa7-8af7-30f094d21fd3
Content-Type: application/json

--- request body ---
{"handle":"qa-371d8130b599","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-147b2ee3-14dd-4aa7-8af7-30f094d21fd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-147b2ee3-14dd-4aa7-8af7-30f094d21fd3"}
```
