# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-6515d658-9304-4426-820e-1351a2caab99` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-4e566e64-9e2b-4c40-9acb-01ba9ee168ca` |
| 3 | `POST /v1/accounts` | 201 | 63 | `qa-a84f6ad4-1c7f-4349-9908-a4ccbdb00900` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-3c94e984-7418-4ca3-8315-f8be9189dcce` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-383dbe97-5372-4b6d-8649-71b82196fce0` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-dc565098-9828-492c-94d0-7f147b7eec21` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-48b1409f-5f7a-45ad-9ac0-15808c88a02f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 62 | `qa-bbed553b-ee55-4d66-ac0b-a26800ce69c8` |
| 9 | `POST /v1/auth/token` | 401 | 28 | `qa-41449f19-19e2-4ec9-84cd-07d0a4b3d038` |
| 10 | `POST /v1/auth/token` | 200 | 44 | `qa-ac040c44-1449-47d3-9997-8b2e76fb2504` |
| 11 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-3bd08763-6b58-4675-8471-61ec728135c6` |
| 12 | `POST /v1/auth/token` | 401 | 40 | `qa-22c4e1ac-c153-4781-b8af-4f8eaa05abe5` |
| 13 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-6400820b-3718-449d-abc4-985dd55c1177` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-f974ef79-91d2-405d-ac58-b0d2612d0f7c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6515d658-9304-4426-820e-1351a2caab99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6515d658-9304-4426-820e-1351a2caab99
Content-Type: application/json

--- request body ---
{"handle":"qa-80289e9e1817","displayName":"QA 80289e9e1817","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6515d658-9304-4426-820e-1351a2caab99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-80289e9e1817
X-Served-Region: eu
Content-Length: 181

{"id":"acc_870dc285-339f-4673-a662-d25b6edeb768","handle":"qa-80289e9e1817","displayName":"QA 80289e9e1817","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.406978601Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e566e64-9e2b-4c40-9acb-01ba9ee168ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e566e64-9e2b-4c40-9acb-01ba9ee168ca
Content-Type: application/json

--- request body ---
{"handle":"qa-cea7eddb96a3","displayName":"QA cea7eddb96a3","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e566e64-9e2b-4c40-9acb-01ba9ee168ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-cea7eddb96a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8319443a-f783-4fca-83ed-a3f2bd3428e5","handle":"qa-cea7eddb96a3","displayName":"QA cea7eddb96a3","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.440195231Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a84f6ad4-1c7f-4349-9908-a4ccbdb00900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a84f6ad4-1c7f-4349-9908-a4ccbdb00900
Content-Type: application/json

--- request body ---
{"handle":"qa-99960f05fd93","displayName":"QA 99960f05fd93","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a84f6ad4-1c7f-4349-9908-a4ccbdb00900
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-99960f05fd93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1558bb62-3217-495b-97e1-2c3d91ebfbc7","handle":"qa-99960f05fd93","displayName":"QA 99960f05fd93","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.527408351Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3c94e984-7418-4ca3-8315-f8be9189dcce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c94e984-7418-4ca3-8315-f8be9189dcce
Content-Type: application/json

--- request body ---
{"handle":"qa-80289e9e1817","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c94e984-7418-4ca3-8315-f8be9189dcce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_870dc285-339f-4673-a662-d25b6edeb768"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-383dbe97-5372-4b6d-8649-71b82196fce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383dbe97-5372-4b6d-8649-71b82196fce0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cea7eddb96a3","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-383dbe97-5372-4b6d-8649-71b82196fce0
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
Location: /v1/conversations/cnv_f1116b29-9da3-41a1-90ec-182533b3dab7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1116b29-9da3-41a1-90ec-182533b3dab7","subject":"Error contract","status":"open","region":"eu","participants":["qa-80289e9e1817","qa-cea7eddb96a3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.589553477Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc565098-9828-492c-94d0-7f147b7eec21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc565098-9828-492c-94d0-7f147b7eec21
Content-Type: application/json

--- request body ---
{"handle":"qa-99960f05fd93","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc565098-9828-492c-94d0-7f147b7eec21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1558bb62-3217-495b-97e1-2c3d91ebfbc7"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f1116b29-9da3-41a1-90ec-182533b3dab7/messages
correlation: qa-48b1409f-5f7a-45ad-9ac0-15808c88a02f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b1409f-5f7a-45ad-9ac0-15808c88a02f
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48b1409f-5f7a-45ad-9ac0-15808c88a02f
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f1116b29-9da3-41a1-90ec-182533b3dab7/messages","correlationId":"qa-48b1409f-5f7a-45ad-9ac0-15808c88a02f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbed553b-ee55-4d66-ac0b-a26800ce69c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbed553b-ee55-4d66-ac0b-a26800ce69c8
Content-Type: application/json

--- response: 204 in 62 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbed553b-ee55-4d66-ac0b-a26800ce69c8
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
correlation: qa-41449f19-19e2-4ec9-84cd-07d0a4b3d038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41449f19-19e2-4ec9-84cd-07d0a4b3d038
Content-Type: application/json

--- request body ---
{"handle":"qa-99960f05fd93","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41449f19-19e2-4ec9-84cd-07d0a4b3d038
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-41449f19-19e2-4ec9-84cd-07d0a4b3d038"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ac040c44-1449-47d3-9997-8b2e76fb2504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac040c44-1449-47d3-9997-8b2e76fb2504
Content-Type: application/json

--- request body ---
{"handle":"qa-cea7eddb96a3","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac040c44-1449-47d3-9997-8b2e76fb2504
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8319443a-f783-4fca-83ed-a3f2bd3428e5"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bd08763-6b58-4675-8471-61ec728135c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bd08763-6b58-4675-8471-61ec728135c6
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bd08763-6b58-4675-8471-61ec728135c6
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
correlation: qa-22c4e1ac-c153-4781-b8af-4f8eaa05abe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22c4e1ac-c153-4781-b8af-4f8eaa05abe5
Content-Type: application/json

--- request body ---
{"handle":"qa-cea7eddb96a3","password":"****"}

--- response: 401 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22c4e1ac-c153-4781-b8af-4f8eaa05abe5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22c4e1ac-c153-4781-b8af-4f8eaa05abe5"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6400820b-3718-449d-abc4-985dd55c1177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6400820b-3718-449d-abc4-985dd55c1177
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6400820b-3718-449d-abc4-985dd55c1177
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
correlation: qa-f974ef79-91d2-405d-ac58-b0d2612d0f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f974ef79-91d2-405d-ac58-b0d2612d0f7c
Content-Type: application/json

--- request body ---
{"handle":"qa-80289e9e1817","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f974ef79-91d2-405d-ac58-b0d2612d0f7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f974ef79-91d2-405d-ac58-b0d2612d0f7c"}
```
