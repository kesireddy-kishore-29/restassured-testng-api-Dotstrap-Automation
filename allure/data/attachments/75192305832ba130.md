# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 552 | `qa-dd0ec89d-ef6b-446b-8378-c1565d349c77` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-92514635-dc22-4990-a462-8de7833253a7` |
| 3 | `POST /v1/accounts` | 201 | 65 | `qa-bfe313e9-1e59-4f38-a8ca-83da2fbc020d` |
| 4 | `POST /v1/auth/token` | 200 | 65 | `qa-339ee3d0-6a4a-4486-9892-8a402c82e13b` |
| 5 | `POST /v1/conversations` | 201 | 60 | `qa-9ef71dab-b752-45a9-b6b6-53e6fee99d88` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-096f2ccb-e486-4bb2-b7cc-66efd179e28a` |
| 7 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-834a9cd2-533a-4255-b455-b454c62149b9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-539610fd-4718-476c-800d-f91b228f9f02` |
| 9 | `POST /v1/auth/token` | 401 | 41 | `qa-1f9499f5-781f-4fac-91e8-562f7e0b6238` |
| 10 | `POST /v1/auth/token` | 200 | 42 | `qa-7759f607-29ba-41d0-ae76-29157f2bc092` |
| 11 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-2a7ce2ff-a1b0-49e8-934c-4e882e240176` |
| 12 | `POST /v1/auth/token` | 401 | 43 | `qa-0153e8fb-09c4-43e9-b745-b02e00178d1e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-ff52fd19-ffc4-480c-ae85-0391f0840486` |
| 14 | `POST /v1/auth/token` | 401 | 24 | `qa-3f242488-695a-49ec-ba49-cc2b6948d1f6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dd0ec89d-ef6b-446b-8378-c1565d349c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd0ec89d-ef6b-446b-8378-c1565d349c77
Content-Type: application/json

--- request body ---
{"handle":"qa-7f9010ff35eb","displayName":"QA 7f9010ff35eb","password":"****","region":"eu"}

--- response: 201 in 552 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd0ec89d-ef6b-446b-8378-c1565d349c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-7f9010ff35eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58ed85e5-264a-4143-be52-26769fd20882","handle":"qa-7f9010ff35eb","displayName":"QA 7f9010ff35eb","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.701171592Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92514635-dc22-4990-a462-8de7833253a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92514635-dc22-4990-a462-8de7833253a7
Content-Type: application/json

--- request body ---
{"handle":"qa-a113253fb30b","displayName":"QA a113253fb30b","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-92514635-dc22-4990-a462-8de7833253a7
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
Location: /v1/accounts/qa-a113253fb30b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa81a379-8ba6-4562-8c5d-dede6d6749d0","handle":"qa-a113253fb30b","displayName":"QA a113253fb30b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.277359195Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-bfe313e9-1e59-4f38-a8ca-83da2fbc020d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfe313e9-1e59-4f38-a8ca-83da2fbc020d
Content-Type: application/json

--- request body ---
{"handle":"qa-e624e917f4d5","displayName":"QA e624e917f4d5","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfe313e9-1e59-4f38-a8ca-83da2fbc020d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-e624e917f4d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_131857fb-60d5-448d-bd95-18b22c3ec416","handle":"qa-e624e917f4d5","displayName":"QA e624e917f4d5","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.366735856Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-339ee3d0-6a4a-4486-9892-8a402c82e13b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-339ee3d0-6a4a-4486-9892-8a402c82e13b
Content-Type: application/json

--- request body ---
{"handle":"qa-7f9010ff35eb","password":"****"}

--- response: 200 in 65 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-339ee3d0-6a4a-4486-9892-8a402c82e13b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58ed85e5-264a-4143-be52-26769fd20882"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9ef71dab-b752-45a9-b6b6-53e6fee99d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ef71dab-b752-45a9-b6b6-53e6fee99d88
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a113253fb30b","subject":"Error contract","message":"Hi"}

--- response: 201 in 60 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ef71dab-b752-45a9-b6b6-53e6fee99d88
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
Location: /v1/conversations/cnv_b33c818f-ab75-4127-9a38-56a16c7a7b1c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b33c818f-ab75-4127-9a38-56a16c7a7b1c","subject":"Error contract","status":"open","region":"eu","participants":["qa-7f9010ff35eb","qa-a113253fb30b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.562994119Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-096f2ccb-e486-4bb2-b7cc-66efd179e28a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096f2ccb-e486-4bb2-b7cc-66efd179e28a
Content-Type: application/json

--- request body ---
{"handle":"qa-e624e917f4d5","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-096f2ccb-e486-4bb2-b7cc-66efd179e28a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_131857fb-60d5-448d-bd95-18b22c3ec416"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b33c818f-ab75-4127-9a38-56a16c7a7b1c
correlation: qa-834a9cd2-533a-4255-b455-b454c62149b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-834a9cd2-533a-4255-b455-b454c62149b9
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-834a9cd2-533a-4255-b455-b454c62149b9
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b33c818f-ab75-4127-9a38-56a16c7a7b1c","correlationId":"qa-834a9cd2-533a-4255-b455-b454c62149b9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-539610fd-4718-476c-800d-f91b228f9f02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539610fd-4718-476c-800d-f91b228f9f02
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-539610fd-4718-476c-800d-f91b228f9f02
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
correlation: qa-1f9499f5-781f-4fac-91e8-562f7e0b6238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f9499f5-781f-4fac-91e8-562f7e0b6238
Content-Type: application/json

--- request body ---
{"handle":"qa-e624e917f4d5","password":"****"}

--- response: 401 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f9499f5-781f-4fac-91e8-562f7e0b6238
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f9499f5-781f-4fac-91e8-562f7e0b6238"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7759f607-29ba-41d0-ae76-29157f2bc092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7759f607-29ba-41d0-ae76-29157f2bc092
Content-Type: application/json

--- request body ---
{"handle":"qa-a113253fb30b","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7759f607-29ba-41d0-ae76-29157f2bc092
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa81a379-8ba6-4562-8c5d-dede6d6749d0"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a7ce2ff-a1b0-49e8-934c-4e882e240176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a7ce2ff-a1b0-49e8-934c-4e882e240176
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a7ce2ff-a1b0-49e8-934c-4e882e240176
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
correlation: qa-0153e8fb-09c4-43e9-b745-b02e00178d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0153e8fb-09c4-43e9-b745-b02e00178d1e
Content-Type: application/json

--- request body ---
{"handle":"qa-a113253fb30b","password":"****"}

--- response: 401 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0153e8fb-09c4-43e9-b745-b02e00178d1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0153e8fb-09c4-43e9-b745-b02e00178d1e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff52fd19-ffc4-480c-ae85-0391f0840486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff52fd19-ffc4-480c-ae85-0391f0840486
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff52fd19-ffc4-480c-ae85-0391f0840486
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-3f242488-695a-49ec-ba49-cc2b6948d1f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f242488-695a-49ec-ba49-cc2b6948d1f6
Content-Type: application/json

--- request body ---
{"handle":"qa-7f9010ff35eb","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f242488-695a-49ec-ba49-cc2b6948d1f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f242488-695a-49ec-ba49-cc2b6948d1f6"}
```
