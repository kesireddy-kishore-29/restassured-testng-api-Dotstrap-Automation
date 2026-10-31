# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 358 | `qa-45fadccd-d970-46f4-bb6c-e4a64d6dc67f` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-b023b441-2313-4b06-ba4b-447a3639c7cf` |
| 3 | `GET /v1/accounts/me` | 200 | 43 | `qa-32a60ad9-5845-477f-a62e-e3061d49213b` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-c43fbfb3-3d70-4572-ab0d-47e5c420c24a` |
| 5 | `GET /v1/accounts/me` | 200 | 14 | `qa-61a67d3b-49d8-4e33-ab93-f3a0ed4293bd` |
| 6 | `GET /v1/accounts/me` | 200 | 14 | `qa-c0b51447-22b8-44dc-87b3-e96a1c104fb9` |
| 7 | `GET /v1/accounts/me` | 200 | 9 | `qa-8d751bbf-bd4c-43c0-96b2-143604d8fe9d` |
| 8 | `GET /v1/accounts/me` | 200 | 12 | `qa-93e5f10b-a6cc-4d54-a566-cba172829644` |
| 9 | `GET /v1/accounts/me` | 200 | 6 | `qa-b7d572d5-f376-470c-985f-093e260b56c8` |
| 10 | `GET /v1/accounts/me` | 200 | 9 | `qa-301ccedc-e43b-4b60-8929-95da4210a652` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-d728eb55-5097-4f29-85c0-ccea16a3afe4` |
| 12 | `GET /v1/accounts/me` | 200 | 14 | `qa-62746e66-8c84-4816-80bf-bf3f0568415f` |
| 13 | `GET /v1/accounts/me` | 200 | 7 | `qa-bbbae328-5c91-4c67-8f25-8c40b08e635a` |
| 14 | `GET /v1/accounts/me` | 200 | 7 | `qa-878141d0-660a-4c01-b6de-e61aac66178a` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-d5a74673-56a5-4984-a4f8-c35362318b5f` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-a4e3cc9c-c011-4a4c-9750-94fddad4a6d2` |
| 17 | `GET /v1/accounts/me` | 200 | 9 | `qa-87d2aa69-bf9e-4c83-b55f-51363e36a5fa` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-6f6b913a-f30f-493a-976f-4411fbea087c` |
| 19 | `GET /v1/accounts/me` | 200 | 11 | `qa-38484adb-24c4-46bf-8e85-7670c680f830` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-d008097a-669e-4fb5-a5b2-90bf72407289` |
| 21 | `GET /v1/accounts/me` | 200 | 12 | `qa-6210897f-b623-40ab-b855-de806df19ba3` |
| 22 | `GET /v1/accounts/me` | 200 | 7 | `qa-bb71a2f6-fa2b-4d25-a312-0f942a49e776` |
| 23 | `GET /v1/accounts/me` | 200 | 10 | `qa-729073dc-17d4-4ed6-ac70-167c31d67927` |
| 24 | `GET /v1/accounts/me` | 200 | 13 | `qa-d04c9d6d-4bd7-4e2f-b2d8-9259cd39503f` |
| 25 | `GET /v1/accounts/me` | 200 | 14 | `qa-8db8401b-7471-4900-8027-c7c3cc3e0a11` |
| 26 | `GET /v1/accounts/me` | 200 | 9 | `qa-8dde47f4-f453-44db-bd61-cdaec948dd59` |
| 27 | `GET /v1/accounts/me` | 200 | 13 | `qa-331e1af2-a755-42a3-ae11-0e558944b53e` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-d33fa0f1-03aa-41e6-8841-70d5be93690a` |
| 29 | `GET /v1/accounts/me` | 200 | 8 | `qa-317c6d4e-573b-468a-b5c8-ca7ba5263b36` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-ebdadce2-5807-462f-ba8b-6da86b35f75b` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-81b39f35-3d8a-412e-a6aa-487376d21d03` |
| 32 | `GET /v1/accounts/me` | 200 | 9 | `qa-8510893a-482a-4738-827f-ac863036e52c` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-5031eee8-3ca9-468d-a033-b67b18ecee1a` |
| 34 | `GET /v1/accounts/me` | 200 | 9 | `qa-4e8ad3ca-5591-4b1e-bc5c-8c2d8a3da064` |
| 35 | `GET /v1/accounts/me` | 200 | 8 | `qa-a4397fbb-b39f-4dea-a6da-930fde4eef58` |
| 36 | `GET /v1/accounts/me` | 200 | 8 | `qa-e1f57b80-333b-4ee1-9ab2-47b43e65c93e` |
| 37 | `GET /v1/accounts/me` | 200 | 6 | `qa-eb5f0669-e0de-408b-99e5-15ead4ac7a4d` |
| 38 | `GET /v1/accounts/me` | 200 | 13 | `qa-9143c010-e56d-4fa4-b3b1-11f2facfdc15` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-5f717d71-8112-4480-b696-912f403abdfc` |
| 40 | `GET /v1/accounts/me` | 200 | 6 | `qa-5bfedd40-2df8-4f50-bc45-34ed3873a5e6` |
| 41 | `GET /v1/accounts/me` | 200 | 13 | `qa-5dd3c67b-0d23-4032-ad58-aad6ec4e8e68` |
| 42 | `GET /v1/accounts/me` | 200 | 15 | `qa-ba29cdd7-9157-4696-96b8-7280caa51f59` |
| 43 | `GET /v1/accounts/me` | 200 | 18 | `qa-17b19919-8f98-4434-b502-a5b4ddb4ca76` |
| 44 | `GET /v1/accounts/me` | 200 | 5 | `qa-8ac09b8e-de2c-4977-86d5-0aa638694ed0` |
| 45 | `GET /v1/accounts/me` | 200 | 8 | `qa-d5ff9854-1dbe-433b-809e-e72cf80987db` |
| 46 | `GET /v1/accounts/me` | 200 | 9 | `qa-55e3fda3-afaf-4787-827c-5a9ff7a88534` |
| 47 | `GET /v1/accounts/me` | 200 | 6 | `qa-b2f29b0c-ed7a-47d3-bff2-79a4c24d5f37` |
| 48 | `GET /v1/accounts/me` | 200 | 6 | `qa-812c0924-a3f9-4ddf-a771-449235343157` |
| 49 | `GET /v1/accounts/me` | 200 | 8 | `qa-87422ffe-38a2-49bb-8795-2b3785f11265` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-bae41137-6b23-4624-84cd-f8fbeb98f2ad` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-23385127-0a88-4785-a799-f473cf4a716f` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-04546d91-5f42-4994-b40a-d422a487f595` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-56a7fa65-83b4-4038-9d41-4d2a1cf5b2b4` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-f829218c-68f6-425d-b20f-13730c542410` |
| 55 | `GET /v1/accounts/me` | 200 | 5 | `qa-0e28e4e7-5852-47e2-a3e1-8889bff240c3` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-581b160f-db21-494c-a607-f81746982efc` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-8f89998b-73fe-4821-a72d-783a9e7ec1f8` |
| 58 | `GET /v1/accounts/me` | 200 | 6 | `qa-7c22546e-b35e-4643-a568-d3e53b896df5` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-7e44e5b5-c0a8-407b-9122-450dcdc70151` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-90d3d193-3067-44d7-b232-fb35e8939a31` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-83f86e6e-6a6d-4eb5-b8d0-0dc3bf978797` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-f9e530d2-d0f1-483e-9b21-aa4f75c54f72` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-0cd0f920-fc85-46df-9e99-9c98608c2c61` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-c6c91fb5-5a96-42eb-97b8-a8622f9cad4b` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-1b0eeba0-ef27-4012-8914-3b89c1d8b6c8` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-3f53fa28-e324-44b6-a013-00b00b62ae07` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-884009bb-02cc-4fc0-83eb-2c89486ebd4d` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-fe6ccfa1-6a8b-4b44-bec8-575ac66b23ef` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-b9c8a437-76a1-4a8b-9ffe-e7620d0230d8` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-ea1b5ec3-fd52-416d-9f10-efa4640c2fd9` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-f2f65d5a-3556-4dbf-a32b-73fc87707b19` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-92b8a80c-7155-461b-ac86-1cd4bf758268` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-b0074a2f-bc6e-44d9-bcc8-38475edd43f5` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-9450025f-adbd-45ee-8c4a-19ee2199eaa2` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-2e46d8a2-235b-4584-94f1-65fab0ba3d4b` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-4daeaf67-8d14-4bce-ad97-e54eba97c684` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-fce2da38-0257-4f94-9bbc-6abe0babe62f` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-cf74c5fd-b3c0-4326-beba-895b7879c6d8` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-f9085818-1eae-4eae-b00d-39fb966a0585` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-6ee9c109-bc47-4e2c-8d9d-650d1b4cb6d6` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-23707c21-68ce-4de9-a747-7cd20a40e7ec` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-fcd8c47b-7a32-4f9d-b60a-3156eaf32bff` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-57b8401f-bdda-47a6-ae3b-fb046e2a6e40` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45fadccd-d970-46f4-bb6c-e4a64d6dc67f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45fadccd-d970-46f4-bb6c-e4a64d6dc67f
Content-Type: application/json

--- request body ---
{"handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","password":"****","region":"eu"}

--- response: 201 in 358 ms ---
Date: Thu, 29 Oct 2026 08:38:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-45fadccd-d970-46f4-bb6c-e4a64d6dc67f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-857c25cde1d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b023b441-2313-4b06-ba4b-447a3639c7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b023b441-2313-4b06-ba4b-447a3639c7cf
Content-Type: application/json

--- request body ---
{"handle":"qa-857c25cde1d0","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b023b441-2313-4b06-ba4b-447a3639c7cf
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-32a60ad9-5845-477f-a62e-e3061d49213b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32a60ad9-5845-477f-a62e-e3061d49213b
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-32a60ad9-5845-477f-a62e-e3061d49213b
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c43fbfb3-3d70-4572-ab0d-47e5c420c24a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c43fbfb3-3d70-4572-ab0d-47e5c420c24a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c43fbfb3-3d70-4572-ab0d-47e5c420c24a
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-61a67d3b-49d8-4e33-ab93-f3a0ed4293bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61a67d3b-49d8-4e33-ab93-f3a0ed4293bd
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-61a67d3b-49d8-4e33-ab93-f3a0ed4293bd
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0b51447-22b8-44dc-87b3-e96a1c104fb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0b51447-22b8-44dc-87b3-e96a1c104fb9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0b51447-22b8-44dc-87b3-e96a1c104fb9
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d751bbf-bd4c-43c0-96b2-143604d8fe9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d751bbf-bd4c-43c0-96b2-143604d8fe9d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d751bbf-bd4c-43c0-96b2-143604d8fe9d
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-93e5f10b-a6cc-4d54-a566-cba172829644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e5f10b-a6cc-4d54-a566-cba172829644
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-93e5f10b-a6cc-4d54-a566-cba172829644
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7d572d5-f376-470c-985f-093e260b56c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7d572d5-f376-470c-985f-093e260b56c8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7d572d5-f376-470c-985f-093e260b56c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-301ccedc-e43b-4b60-8929-95da4210a652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-301ccedc-e43b-4b60-8929-95da4210a652
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-301ccedc-e43b-4b60-8929-95da4210a652
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-d728eb55-5097-4f29-85c0-ccea16a3afe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d728eb55-5097-4f29-85c0-ccea16a3afe4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d728eb55-5097-4f29-85c0-ccea16a3afe4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-62746e66-8c84-4816-80bf-bf3f0568415f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62746e66-8c84-4816-80bf-bf3f0568415f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-62746e66-8c84-4816-80bf-bf3f0568415f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbbae328-5c91-4c67-8f25-8c40b08e635a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbbae328-5c91-4c67-8f25-8c40b08e635a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbbae328-5c91-4c67-8f25-8c40b08e635a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-878141d0-660a-4c01-b6de-e61aac66178a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-878141d0-660a-4c01-b6de-e61aac66178a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-878141d0-660a-4c01-b6de-e61aac66178a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5a74673-56a5-4984-a4f8-c35362318b5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a74673-56a5-4984-a4f8-c35362318b5f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5a74673-56a5-4984-a4f8-c35362318b5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4e3cc9c-c011-4a4c-9750-94fddad4a6d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4e3cc9c-c011-4a4c-9750-94fddad4a6d2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4e3cc9c-c011-4a4c-9750-94fddad4a6d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-87d2aa69-bf9e-4c83-b55f-51363e36a5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87d2aa69-bf9e-4c83-b55f-51363e36a5fa
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-87d2aa69-bf9e-4c83-b55f-51363e36a5fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f6b913a-f30f-493a-976f-4411fbea087c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f6b913a-f30f-493a-976f-4411fbea087c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f6b913a-f30f-493a-976f-4411fbea087c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-38484adb-24c4-46bf-8e85-7670c680f830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38484adb-24c4-46bf-8e85-7670c680f830
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-38484adb-24c4-46bf-8e85-7670c680f830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d008097a-669e-4fb5-a5b2-90bf72407289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d008097a-669e-4fb5-a5b2-90bf72407289
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d008097a-669e-4fb5-a5b2-90bf72407289
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-6210897f-b623-40ab-b855-de806df19ba3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6210897f-b623-40ab-b855-de806df19ba3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6210897f-b623-40ab-b855-de806df19ba3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb71a2f6-fa2b-4d25-a312-0f942a49e776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb71a2f6-fa2b-4d25-a312-0f942a49e776
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb71a2f6-fa2b-4d25-a312-0f942a49e776
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-729073dc-17d4-4ed6-ac70-167c31d67927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-729073dc-17d4-4ed6-ac70-167c31d67927
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-729073dc-17d4-4ed6-ac70-167c31d67927
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-d04c9d6d-4bd7-4e2f-b2d8-9259cd39503f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d04c9d6d-4bd7-4e2f-b2d8-9259cd39503f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d04c9d6d-4bd7-4e2f-b2d8-9259cd39503f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-8db8401b-7471-4900-8027-c7c3cc3e0a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db8401b-7471-4900-8027-c7c3cc3e0a11
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8db8401b-7471-4900-8027-c7c3cc3e0a11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dde47f4-f453-44db-bd61-cdaec948dd59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dde47f4-f453-44db-bd61-cdaec948dd59
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dde47f4-f453-44db-bd61-cdaec948dd59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-331e1af2-a755-42a3-ae11-0e558944b53e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-331e1af2-a755-42a3-ae11-0e558944b53e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-331e1af2-a755-42a3-ae11-0e558944b53e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-d33fa0f1-03aa-41e6-8841-70d5be93690a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d33fa0f1-03aa-41e6-8841-70d5be93690a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d33fa0f1-03aa-41e6-8841-70d5be93690a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-317c6d4e-573b-468a-b5c8-ca7ba5263b36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317c6d4e-573b-468a-b5c8-ca7ba5263b36
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-317c6d4e-573b-468a-b5c8-ca7ba5263b36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebdadce2-5807-462f-ba8b-6da86b35f75b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebdadce2-5807-462f-ba8b-6da86b35f75b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebdadce2-5807-462f-ba8b-6da86b35f75b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-81b39f35-3d8a-412e-a6aa-487376d21d03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b39f35-3d8a-412e-a6aa-487376d21d03
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-81b39f35-3d8a-412e-a6aa-487376d21d03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-8510893a-482a-4738-827f-ac863036e52c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8510893a-482a-4738-827f-ac863036e52c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8510893a-482a-4738-827f-ac863036e52c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-5031eee8-3ca9-468d-a033-b67b18ecee1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5031eee8-3ca9-468d-a033-b67b18ecee1a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5031eee8-3ca9-468d-a033-b67b18ecee1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e8ad3ca-5591-4b1e-bc5c-8c2d8a3da064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8ad3ca-5591-4b1e-bc5c-8c2d8a3da064
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e8ad3ca-5591-4b1e-bc5c-8c2d8a3da064
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4397fbb-b39f-4dea-a6da-930fde4eef58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4397fbb-b39f-4dea-a6da-930fde4eef58
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4397fbb-b39f-4dea-a6da-930fde4eef58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1f57b80-333b-4ee1-9ab2-47b43e65c93e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1f57b80-333b-4ee1-9ab2-47b43e65c93e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1f57b80-333b-4ee1-9ab2-47b43e65c93e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb5f0669-e0de-408b-99e5-15ead4ac7a4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb5f0669-e0de-408b-99e5-15ead4ac7a4d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb5f0669-e0de-408b-99e5-15ead4ac7a4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-9143c010-e56d-4fa4-b3b1-11f2facfdc15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9143c010-e56d-4fa4-b3b1-11f2facfdc15
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9143c010-e56d-4fa4-b3b1-11f2facfdc15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f717d71-8112-4480-b696-912f403abdfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f717d71-8112-4480-b696-912f403abdfc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f717d71-8112-4480-b696-912f403abdfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-5bfedd40-2df8-4f50-bc45-34ed3873a5e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bfedd40-2df8-4f50-bc45-34ed3873a5e6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bfedd40-2df8-4f50-bc45-34ed3873a5e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dd3c67b-0d23-4032-ad58-aad6ec4e8e68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dd3c67b-0d23-4032-ad58-aad6ec4e8e68
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dd3c67b-0d23-4032-ad58-aad6ec4e8e68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba29cdd7-9157-4696-96b8-7280caa51f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba29cdd7-9157-4696-96b8-7280caa51f59
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba29cdd7-9157-4696-96b8-7280caa51f59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-17b19919-8f98-4434-b502-a5b4ddb4ca76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b19919-8f98-4434-b502-a5b4ddb4ca76
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-17b19919-8f98-4434-b502-a5b4ddb4ca76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ac09b8e-de2c-4977-86d5-0aa638694ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ac09b8e-de2c-4977-86d5-0aa638694ed0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ac09b8e-de2c-4977-86d5-0aa638694ed0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5ff9854-1dbe-433b-809e-e72cf80987db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5ff9854-1dbe-433b-809e-e72cf80987db
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5ff9854-1dbe-433b-809e-e72cf80987db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-55e3fda3-afaf-4787-827c-5a9ff7a88534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55e3fda3-afaf-4787-827c-5a9ff7a88534
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-55e3fda3-afaf-4787-827c-5a9ff7a88534
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2f29b0c-ed7a-47d3-bff2-79a4c24d5f37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2f29b0c-ed7a-47d3-bff2-79a4c24d5f37
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2f29b0c-ed7a-47d3-bff2-79a4c24d5f37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-812c0924-a3f9-4ddf-a771-449235343157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-812c0924-a3f9-4ddf-a771-449235343157
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-812c0924-a3f9-4ddf-a771-449235343157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-87422ffe-38a2-49bb-8795-2b3785f11265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87422ffe-38a2-49bb-8795-2b3785f11265
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-87422ffe-38a2-49bb-8795-2b3785f11265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-bae41137-6b23-4624-84cd-f8fbeb98f2ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bae41137-6b23-4624-84cd-f8fbeb98f2ad
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bae41137-6b23-4624-84cd-f8fbeb98f2ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-23385127-0a88-4785-a799-f473cf4a716f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23385127-0a88-4785-a799-f473cf4a716f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-23385127-0a88-4785-a799-f473cf4a716f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-04546d91-5f42-4994-b40a-d422a487f595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04546d91-5f42-4994-b40a-d422a487f595
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-04546d91-5f42-4994-b40a-d422a487f595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-56a7fa65-83b4-4038-9d41-4d2a1cf5b2b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a7fa65-83b4-4038-9d41-4d2a1cf5b2b4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-56a7fa65-83b4-4038-9d41-4d2a1cf5b2b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-f829218c-68f6-425d-b20f-13730c542410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f829218c-68f6-425d-b20f-13730c542410
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f829218c-68f6-425d-b20f-13730c542410
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e28e4e7-5852-47e2-a3e1-8889bff240c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e28e4e7-5852-47e2-a3e1-8889bff240c3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e28e4e7-5852-47e2-a3e1-8889bff240c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-581b160f-db21-494c-a607-f81746982efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-581b160f-db21-494c-a607-f81746982efc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-581b160f-db21-494c-a607-f81746982efc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f89998b-73fe-4821-a72d-783a9e7ec1f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f89998b-73fe-4821-a72d-783a9e7ec1f8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f89998b-73fe-4821-a72d-783a9e7ec1f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c22546e-b35e-4643-a568-d3e53b896df5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c22546e-b35e-4643-a568-d3e53b896df5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c22546e-b35e-4643-a568-d3e53b896df5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e44e5b5-c0a8-407b-9122-450dcdc70151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e44e5b5-c0a8-407b-9122-450dcdc70151
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e44e5b5-c0a8-407b-9122-450dcdc70151
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-90d3d193-3067-44d7-b232-fb35e8939a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d3d193-3067-44d7-b232-fb35e8939a31
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-90d3d193-3067-44d7-b232-fb35e8939a31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-83f86e6e-6a6d-4eb5-b8d0-0dc3bf978797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f86e6e-6a6d-4eb5-b8d0-0dc3bf978797
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-83f86e6e-6a6d-4eb5-b8d0-0dc3bf978797
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9e530d2-d0f1-483e-9b21-aa4f75c54f72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9e530d2-d0f1-483e-9b21-aa4f75c54f72
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9e530d2-d0f1-483e-9b21-aa4f75c54f72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-0cd0f920-fc85-46df-9e99-9c98608c2c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cd0f920-fc85-46df-9e99-9c98608c2c61
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cd0f920-fc85-46df-9e99-9c98608c2c61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0cd0f920-fc85-46df-9e99-9c98608c2c61"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-c6c91fb5-5a96-42eb-97b8-a8622f9cad4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c91fb5-5a96-42eb-97b8-a8622f9cad4b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6c91fb5-5a96-42eb-97b8-a8622f9cad4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c6c91fb5-5a96-42eb-97b8-a8622f9cad4b"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b0eeba0-ef27-4012-8914-3b89c1d8b6c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b0eeba0-ef27-4012-8914-3b89c1d8b6c8
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b0eeba0-ef27-4012-8914-3b89c1d8b6c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1b0eeba0-ef27-4012-8914-3b89c1d8b6c8"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f53fa28-e324-44b6-a013-00b00b62ae07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f53fa28-e324-44b6-a013-00b00b62ae07
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f53fa28-e324-44b6-a013-00b00b62ae07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3f53fa28-e324-44b6-a013-00b00b62ae07"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-884009bb-02cc-4fc0-83eb-2c89486ebd4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884009bb-02cc-4fc0-83eb-2c89486ebd4d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-884009bb-02cc-4fc0-83eb-2c89486ebd4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-884009bb-02cc-4fc0-83eb-2c89486ebd4d"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe6ccfa1-6a8b-4b44-bec8-575ac66b23ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe6ccfa1-6a8b-4b44-bec8-575ac66b23ef
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe6ccfa1-6a8b-4b44-bec8-575ac66b23ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fe6ccfa1-6a8b-4b44-bec8-575ac66b23ef"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9c8a437-76a1-4a8b-9ffe-e7620d0230d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9c8a437-76a1-4a8b-9ffe-e7620d0230d8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9c8a437-76a1-4a8b-9ffe-e7620d0230d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b9c8a437-76a1-4a8b-9ffe-e7620d0230d8"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea1b5ec3-fd52-416d-9f10-efa4640c2fd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea1b5ec3-fd52-416d-9f10-efa4640c2fd9
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea1b5ec3-fd52-416d-9f10-efa4640c2fd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ea1b5ec3-fd52-416d-9f10-efa4640c2fd9"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2f65d5a-3556-4dbf-a32b-73fc87707b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2f65d5a-3556-4dbf-a32b-73fc87707b19
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2f65d5a-3556-4dbf-a32b-73fc87707b19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f2f65d5a-3556-4dbf-a32b-73fc87707b19"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-92b8a80c-7155-461b-ac86-1cd4bf758268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b8a80c-7155-461b-ac86-1cd4bf758268
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92b8a80c-7155-461b-ac86-1cd4bf758268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-92b8a80c-7155-461b-ac86-1cd4bf758268"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0074a2f-bc6e-44d9-bcc8-38475edd43f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0074a2f-bc6e-44d9-bcc8-38475edd43f5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0074a2f-bc6e-44d9-bcc8-38475edd43f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0074a2f-bc6e-44d9-bcc8-38475edd43f5"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-9450025f-adbd-45ee-8c4a-19ee2199eaa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9450025f-adbd-45ee-8c4a-19ee2199eaa2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9450025f-adbd-45ee-8c4a-19ee2199eaa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9450025f-adbd-45ee-8c4a-19ee2199eaa2"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e46d8a2-235b-4584-94f1-65fab0ba3d4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e46d8a2-235b-4584-94f1-65fab0ba3d4b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e46d8a2-235b-4584-94f1-65fab0ba3d4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2e46d8a2-235b-4584-94f1-65fab0ba3d4b"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-4daeaf67-8d14-4bce-ad97-e54eba97c684

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4daeaf67-8d14-4bce-ad97-e54eba97c684
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4daeaf67-8d14-4bce-ad97-e54eba97c684
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4daeaf67-8d14-4bce-ad97-e54eba97c684"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-fce2da38-0257-4f94-9bbc-6abe0babe62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce2da38-0257-4f94-9bbc-6abe0babe62f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fce2da38-0257-4f94-9bbc-6abe0babe62f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fce2da38-0257-4f94-9bbc-6abe0babe62f"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf74c5fd-b3c0-4326-beba-895b7879c6d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf74c5fd-b3c0-4326-beba-895b7879c6d8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf74c5fd-b3c0-4326-beba-895b7879c6d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf74c5fd-b3c0-4326-beba-895b7879c6d8"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9085818-1eae-4eae-b00d-39fb966a0585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9085818-1eae-4eae-b00d-39fb966a0585
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9085818-1eae-4eae-b00d-39fb966a0585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f9085818-1eae-4eae-b00d-39fb966a0585"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ee9c109-bc47-4e2c-8d9d-650d1b4cb6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee9c109-bc47-4e2c-8d9d-650d1b4cb6d6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ee9c109-bc47-4e2c-8d9d-650d1b4cb6d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ee9c109-bc47-4e2c-8d9d-650d1b4cb6d6"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-23707c21-68ce-4de9-a747-7cd20a40e7ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23707c21-68ce-4de9-a747-7cd20a40e7ec
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-23707c21-68ce-4de9-a747-7cd20a40e7ec
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
Content-Length: 181

{"id":"acc_a9f353da-18b7-4641-a85e-dc7e741d06ee","handle":"qa-857c25cde1d0","displayName":"QA 857c25cde1d0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.954593571Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcd8c47b-7a32-4f9d-b60a-3156eaf32bff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcd8c47b-7a32-4f9d-b60a-3156eaf32bff
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcd8c47b-7a32-4f9d-b60a-3156eaf32bff
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-57b8401f-bdda-47a6-ae3b-fb046e2a6e40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b8401f-bdda-47a6-ae3b-fb046e2a6e40
Content-Type: application/json

--- request body ---
{"handle":"qa-857c25cde1d0","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57b8401f-bdda-47a6-ae3b-fb046e2a6e40
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57b8401f-bdda-47a6-ae3b-fb046e2a6e40"}
```
